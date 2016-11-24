package world;

import java.util.ArrayList;
import java.util.List;

public class World {
	
	private List<Planet> planets;
	private List<Ship> ships;
	private List<Ship> species;
	
	public World() {
		
	}
	/**
	 * @return the planets
	 */
	public List<Planet> getPlanets() {
		return planets;
	}
	/**
	 * @param planets the planets to set
	 */
	public void setPlanets(ArrayList<Planet> planets) {
		this.planets = planets;
	}
	/**
	 * @return the ships
	 */
	public List<Ship> getShips() {
		return ships;
	}
	/**
	 * @param ships the ships to set
	 */
	public void setShips(ArrayList<Ship> ships) {
		this.ships = ships;
	}
	
	
}
