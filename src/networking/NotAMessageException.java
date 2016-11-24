/**
 * 
 */
package networking;

/**
 * @author joelmanning
 *
 */
public class NotAMessageException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1466867333228673259L;
	
	public NotAMessageException(){
		super("Recieved a class other than Message in the listener.");
	}
}
