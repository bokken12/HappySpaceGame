package client;

import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JPanel;

import world.Map;
import world.Planet;
import world.Ship;

public class MapDisplay extends JPanel {
	
	Map myWorld;
	Point cameraPosition = new Point(0, 0);
	
	public MapDisplay() {
		
	}
	
	@Override
	public void paintComponent(Graphics g) {
		for(Planet p : myWorld.planets) {
			Point pos = convertPointToScreen(p.location);
			g.drawImage(p.image.getImage(), pos.x, pos.y, this);
		}
		
		for(Ship s : myWorld.ships) {
			Point pos = convertPointToScreen(s.getLocation());
			g.drawImage(s.image.getImage(), pos.x, pos.y, this);
		}
	}
	
	public Point convertPointToScreen(Point p) {
		Point ret = p;
		p.x -= cameraPosition.x;
		p.y -= cameraPosition.y;
		return p;
	}
}
