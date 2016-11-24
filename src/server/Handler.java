/**
 * 
 */
package server;

import java.net.Socket;

import networking.Message;
import networking.MessageListener;
import networking.Messager;
import networking.MessagerInitFailedException;

/**
 * @author joelmanning
 *
 */
public class Handler implements MessageListener{
	private Messager messager;
	public Handler(Socket s) {
		try {
			messager = new Messager(s, this);
		} catch(MessagerInitFailedException e) {
			e.printStackTrace();
		}
	}
	/* (non-Javadoc)
	 * @see networking.MessageListener#messageRecieved(networking.Message)
	 */
	@Override
	public void messageRecieved(Message m) {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see networking.MessageListener#close()
	 */
	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}
}
