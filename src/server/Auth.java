/**
 * 
 */
package server;

import java.io.File;
import java.util.HashMap;

/**
 * @author joelmanning
 *
 */
public class Auth {
	public Auth(){
		
	}
	public Player getPlayer(String username){
		File f = new File("/data/players/" + username + ".txt");
		if(!f.exists()){
			throw new IllegalArgumentException("No player with that username");
		}
		return parsePlayer(f);
	}
	private Player parsePlayer(File f){
		//TODO parsing
		return new Player();
	}
}
