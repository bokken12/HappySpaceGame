package world;

import java.awt.Image;
import java.awt.Point;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Planet {
	
	private Point location;
	private String name;
	private Species inhabitant;
	private int defenseLevel = 5;
	private int productionLevel = 1;
	private List<Item> treasury = new ArrayList<Item>();
	private ImageIcon image = new ImageIcon("p2.png");
	private int size;
	
	
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
			ImageIcon image, int size) {
		super();
		this.location = location;
		this.name = name;
		this.inhabitant = inhabitant;
		this.defenseLevel = defenseLevel;
		this.productionLevel = productionLevel;
		this.treasury = treasury;
		this.image = image;
		this.size = size;
	}
	
	public Planet(Point location, String name, Species inhabitant, int defenseLevel, int productionLevel, int size) {
		super();
		this.location = location;
		this.name = name;
		this.inhabitant = inhabitant;
		this.defenseLevel = defenseLevel;
		this.productionLevel = productionLevel;
		this.size = size;
		this.treasury = new ArrayList<Item>();
		try {
			this.image = new ImageIcon(ImageIO.read(new File("p" + (int)(Math.random() * 4 + 1) + ".png")).getScaledInstance(size, size, Image.SCALE_SMOOTH));
		} catch(IOException e) {
			e.printStackTrace();
		}
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

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		Planet other = (Planet) obj;
		if(name == null) {
			if(other.name != null)
				return false;
		} else if(!name.equals(other.name))
			return false;
		return true;
	}
	
}
