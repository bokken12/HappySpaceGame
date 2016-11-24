package client;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JPanel;

import world.World;
import world.Planet;
import world.Ship;

public class MapDisplay extends JPanel {
	
	World myWorld;
	Point cameraPosition;
	GameClient game;
	
	public MapDisplay(GameClient game) {
		cameraPosition = new Point(0, 0);
		this.game = game;
	}
	
	@Override
	public void paintComponent(Graphics g) {
		game.frame.setBackground(Color.BLACK);
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
		Point ret = new Point(p);
		ret.x -= cameraPosition.x;
		ret.y -= cameraPosition.y;
		return ret;
	}
	
	public Object getClick() {
		return null;
	}
	
}
