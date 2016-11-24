package world;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class World {
	
	private final Set<Planet> planets;
	private final Set<Ship> ships;
	private final Set<Species> species;
	
	public World() {
		planets = new HashSet<Planet>();
		ships = new HashSet<Ship>();
		species = new HashSet<Species>();
	}
	
	/**
	 * @return the planets
	 */
	public Set<Planet> getPlanets() {
		return planets;
	}
	
	/**
	 * @return the ships
	 */
	public Set<Ship> getShips() {
		return ships;
	}
	
	/**
	 * @return the species
	 */
	public Set<Species> getSpecies() {
		return species;
	}
	
}
