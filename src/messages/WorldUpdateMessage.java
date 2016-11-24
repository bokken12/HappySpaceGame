/**
 * 
 */
package messages;

import world.World;
import networking.Message;

/**
 * @author joelmanning
 *
 */
public abstract class WorldUpdateMessage extends Message {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6345536710452642418L;
	
	public abstract void update(World w);
}
