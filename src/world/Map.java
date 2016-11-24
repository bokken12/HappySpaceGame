package world;

import java.util.ArrayList;

public class Map {
	
	private ArrayList<Planet> planets;
	private ArrayList<Ship> ships;
	public Map() {
		
	}
	/**
	 * @return the planets
	 */
	public ArrayList<Planet> getPlanets() {
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
	public ArrayList<Ship> getShips() {
		return ships;
	}
	/**
	 * @param ships the ships to set
	 */
	public void setShips(ArrayList<Ship> ships) {
		this.ships = ships;
	}
	
	
}
