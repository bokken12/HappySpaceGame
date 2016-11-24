package client;

import javax.swing.JFrame;

import world.Planet;

public class GameClient {

	
	MapDisplay mapDisplay;
	Input input;
	JFrame frame;
	
	
	public GameClient() {
		mapDisplay = new MapDisplay();
		input = new Input();
	}
	
	public void update() {
		mapDisplay.repaint();
	}
	
	public void displayPlanetScreen(Planet p) {
		frame.remove(mapDisplay);
		frame.add(new PlanetDisplay(p));
	}
}
