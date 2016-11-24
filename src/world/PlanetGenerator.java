package world;

import java.util.ArrayList;

import javax.swing.ImageIcon;

public class PlanetGenerator {
	
	static ArrayList<ImageIcon> planetImages = new ArrayList<ImageIcon>();
	

	public static Planet newPlanet() {
		
		Planet p = new Planet();
		p.setName("New Meegledom");
		p.productionLevel = (int) Math.random()*3;
		p.image = planetImages.get((int) Math.random()*planetImages.size());
		
		return p;
	}
}