/**
 * 
 */
package networking;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * @author joelmanning
 *
 */
public class Messager extends Thread {
	private Socket socket;
	private ObjectInputStream ois;
	private ObjectOutputStream oos;
	private MessageListener listener;
	private boolean running;
	
	public Messager(Socket socket, MessageListener listener)
			throws MessagerInitFailedException {
		running = false;
		this.socket = socket;
		this.listener = listener;
		try {
			ois = new ObjectInputStream(socket.getInputStream());
			oos = new ObjectOutputStream(socket.getOutputStream());
		} catch(IOException e) {
			throw new MessagerInitFailedException(
					"Failed to initialize IO streams: " + e.getMessage());
		}
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		super.run();
		running = true;
		while(running) {
			try {
				Object o = ois.readObject();
				if(o instanceof Message) {
					listener.messageRecieved((Message) o);
				} else {
					(new NotAMessageException()).printStackTrace();
					listener.close();
					running = false;
				}
			} catch(ClassNotFoundException e) {
				e.printStackTrace();
				listener.close();
				running = false;
			} catch(IOException e) {
				e.printStackTrace();
				listener.close();
				running = false;
			}
		}
	}
	
	public void sendMessage(Message m) {
		try {
			oos.writeObject(m);
			oos.flush();
		} catch(IOException e) {
			e.printStackTrace();
			listener.close();
			running = false;
		}
	}
	
	public boolean isRunning() {
		return running;
	}
}