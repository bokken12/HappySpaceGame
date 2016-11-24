package world;

import java.awt.Point;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Planet {
	
	public Point location;
	/**
	 * @return the location
	 */
	public Point getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(Point location) {
		this.location = location;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the inhabitant
	 */
	public Species getInhabitant() {
		return inhabitant;
	}

	/**
	 * @param inhabitant the inhabitant to set
	 */
	public void setInhabitant(Species inhabitant) {
		this.inhabitant = inhabitant;
	}

	/**
	 * @return the defenseLevel
	 */
	public int getDefenseLevel() {
		return defenseLevel;
	}

	/**
	 * @param defenseLevel the defenseLevel to set
	 */
	public void setDefenseLevel(int defenseLevel) {
		this.defenseLevel = defenseLevel;
	}

	/**
	 * @return the productionLevel
	 */
	public int getProductionLevel() {
		return productionLevel;
	}

	/**
	 * @param productionLevel the productionLevel to set
	 */
	public void setProductionLevel(int productionLevel) {
		this.productionLevel = productionLevel;
	}

	/**
	 * @return the treasury
	 */
	public ArrayList<Item> getTreasury() {
		return treasury;
	}

	/**
	 * @param treasury the treasury to set
	 */
	public void setTreasury(ArrayList<Item> treasury) {
		this.treasury = treasury;
	}

	/**
	 * @return the image
	 */
	public ImageIcon getImage() {
		return image;
	}

	/**
	 * @param image the image to set
	 */
	public void setImage(ImageIcon image) {
		this.image = image;
	}

	String name;
	Species inhabitant;
	int defenseLevel = 5;
	int productionLevel = 1;
	ArrayList<Item> treasury = new ArrayList<Item>();
	public ImageIcon image = new ImageIcon("p2.png");
	
	public Planet() {
		
	}
}
