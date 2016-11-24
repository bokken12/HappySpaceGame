/**
 * 
 */
package messages;

import world.Planet;
import world.World;

/**
 * @author joelmanning
 *
 */
public class PlanetUpdateMessage extends WorldUpdateMessage {
	
	private Planet p;
	
	/* (non-Javadoc)
	 * @see messages.WorldUpdateMessage#update(world.World)
	 */
	@Override
	public void update(World w) {
		w.getPlanets().add(p);
	}
	
}
