package world;

import java.awt.Point;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Planet {

	public Point location;
	String name;
	Species inhabitant;
	int defenseLevel = 5;
	int productionLevel = 1;
	ArrayList<Item> treasury = new ArrayList<Item>();
	public ImageIcon image = new ImageIcon("p2.png");
	
	public Planet() {
		
	}
}
