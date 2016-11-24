package client;

import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JPanel;

import world.World;
import world.Planet;
import world.Ship;

public class MapDisplay extends JPanel {
	
	World myWorld;
	Point cameraPosition = new Point(0, 0);
	
	public MapDisplay() {
		
	}
	
	@Override
	public void paintComponent(Graphics g) {
		for(Planet p : myWorld.getPlanets()) {
			Point pos = convertPointToScreen(p.getLocation());
			g.drawImage(p.getImage().getImage(), pos.x, pos.y, this);
		}
		
		for(Ship s : myWorld.getShips()) {
			Point pos = convertPointToScreen(s.getLocation());
			g.drawImage(s.getImage().getImage(), pos.x, pos.y, this);
		}
	}
	
	public Point convertPointToScreen(Point p) {
		Point ret = p;
		p.x -= cameraPosition.x;
		p.y -= cameraPosition.y;
		return p;
	}
	
	public Object getClick() {
		return null;
	}
	
}
