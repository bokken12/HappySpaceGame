package world;

import java.awt.Point;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Planet {
	
	public Point location;
	String name;
	Species inhabitant;
	int defenseLevel;
	int productionLevel;
	ArrayList<Item> treasury;
	public ImageIcon image;
	
	public Planet() {
		
	}
}
