package client;

import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JPanel;

import world.Map;
import world.Planet;

public class MapDisplay extends JPanel {

	Map myWorld;
	Point cameraPosition;
	
	public MapDisplay() {
		
	}
	
	@Override
	public void paintComponent(Graphics g) {
		for(Planet p : myWorld.planets) {
			Point pos = convertPointToScreen(p.location);
			g.drawImage(p.image.getImage(), pos.x, pos.y, this);
		}
	}
	
	public Point convertPointToScreen(Point p) {
		Point ret = p;
		return p;
	}
}
