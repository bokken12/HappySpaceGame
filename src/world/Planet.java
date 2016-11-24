package world;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;

public class Planet {
	
	private Point location;
	private String name;
	private Species inhabitant;
	private int defenseLevel = 5;
	private int productionLevel = 1;
	private List<Item> treasury = new ArrayList<Item>();
	private ImageIcon image = new ImageIcon("p2.png");
	
	
	/**
	 * @param location
	 * @param name
	 * @param inhabitant
	 * @param defenseLevel
	 * @param productionLevel
	 * @param treasury
	 * @param image
	 */
	public Planet(Point location, String name, Species inhabitant,
			int defenseLevel, int productionLevel, List<Item> treasury,
			ImageIcon image) {
		super();
		this.location = location;
		this.name = name;
		this.inhabitant = inhabitant;
		this.defenseLevel = defenseLevel;
		this.productionLevel = productionLevel;
		this.treasury = treasury;
		this.image = image;
	}
	
	public Planet(Point location, String name, Species inhabitant) {
		super();
		this.location = location;
		this.name = name;
		this.inhabitant = inhabitant;
		this.defenseLevel = 5;
		this.productionLevel = 1;
		this.treasury = new ArrayList<Item>();
		this.image = new ImageIcon("p" + (int)(Math.random() * 5 + 1) + ".png");
	}

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
	public List<Item> getTreasury() {
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
}
