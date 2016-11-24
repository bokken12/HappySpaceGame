package world;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;

public class PlanetGenerator {
	
	static List<ImageIcon> planetImages = new ArrayList<ImageIcon>();
	
	static void init() {
		planetImages.add(new ImageIcon("p1"));
		planetImages.add(new ImageIcon("p2"));
		planetImages.add(new ImageIcon("p3"));
		planetImages.add(new ImageIcon("p4"));
		planetImages.add(new ImageIcon("p5"));
	}

	/*public static Planet newPlanet() {
		
		Planet p = new Planet();
		p.setName("New Meegledom");
		p.setProductionLevel((int) Math.random()*3);
		p.setImage(planetImages.get((int) Math.random()*planetImages.size()));
		
		return p;
	}*/
	
	public static World generateWorld(int size) {
		World w = new World();
		for(int i = 0; i < size; i++){
			w.getPlanets().add(new Planet(new Point((int)(Math.random() * 2 * size - size), (int)(Math.random() * 2 * size - size)), "New Meegledom", null));
		}
		return w;
	}
}