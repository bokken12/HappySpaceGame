package client;

import javax.swing.JFrame;

import networking.Message;
import networking.MessageListener;
import world.Planet;

public class GameClient implements MessageListener {
	
	MapDisplay mapDisplay;
	Input input;
	JFrame frame;
	
	
	public GameClient() {
		frame = new JFrame();
		mapDisplay = new MapDisplay();
		input = new Input();
		frame.add(mapDisplay);
	}
	
	public void update() {
		mapDisplay.repaint();
	}
	
	public void displayPlanetScreen(Planet p) {
		frame.remove(mapDisplay);
		frame.add(new PlanetDisplay(p));
	}

	@Override
	public void messageRecieved(Message m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}
}
