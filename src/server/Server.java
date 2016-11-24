/**
 * 
 */
package server;

import java.io.IOException;
import java.net.ServerSocket;

/**
 * @author joelmanning
 *
 */
public class Server {
	public static final int PORT = 9000;
	
	private ServerSocket s;
	
	public Server() {
		try {
			s = new ServerSocket(PORT);
		} catch(IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
	
	public void run() {
		while(true){
			try {
				new Handler(s.accept());
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		(new Server()).run();
	}
}
