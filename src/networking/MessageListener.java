/**
 * 
 */
package networking;

/**
 * @author joelmanning
 *
 */
public interface MessageListener {
	void messageRecieved(Message m);
	void close();
}
