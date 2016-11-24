package client;

import java.awt.Color;

import javax.swing.JFrame;

import networking.Message;
import networking.MessageListener;
import world.Planet;
import world.PlanetGenerator;

public class GameClient implements MessageListener {
	
	MapDisplay mapDisplay;
	Input input;
	JFrame frame;
	
	
	public GameClient() {
		frame = new JFrame();
		mapDisplay = new MapDisplay();
		mapDisplay.myWorld = PlanetGenerator.generateWorld(20);
		input = new Input(this);
		frame.add(mapDisplay);
		frame.setSize(500, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.requestFocus();
		frame.pack();
		frame.repaint();
		frame.setBackground(Color.BLACK);
		frame.addKeyListener(input);
		frame.addMouseListener(input);
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
