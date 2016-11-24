package world;

import java.awt.Image;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;

public class PlanetGenerator {
	
	static List<ImageIcon> planetImages = new ArrayList<ImageIcon>();
	
	static void init() {
		for(int i = 1; i < 6; i++) {
			planetImages.add(scaledImage("p" + i));
		}
	}
	
	private static ImageIcon scaledImage(String name) {
		ImageIcon i = new ImageIcon("p5");
		i.setImage(i.getImage().getScaledInstance((int) 50, 50, Image.SCALE_DEFAULT));
		return i;
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
			w.getPlanets().add(new Planet(new Point((int)(Math.random() * 20 * size - size), (int)(Math.random() * 20 * size - size)), "New Meegledom", null, 5, 1, 10));
		}
		return w;
	}
}