package client;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

import networking.Message;
import networking.MessageListener;
import world.Planet;
import world.PlanetGenerator;

public class GameClient extends JFrame implements MessageListener {
	
	MapDisplay mapDisplay;
	Input input;
	
	
	public GameClient() {
		mapDisplay = new MapDisplay();
		mapDisplay.myWorld = PlanetGenerator.generateWorld(20);
		input = new Input(this);
		
		add(mapDisplay);
		setPreferredSize(new Dimension(400, 400));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		requestFocus();
		pack();
		repaint();
		setBackground(Color.BLACK);
		addKeyListener(input);
		addMouseListener(input);
	}
	
	public void update() {
		mapDisplay.repaint();
	}
	
	public void displayPlanetScreen(Planet p) {
		remove(mapDisplay);
		add(new PlanetDisplay(p));
		
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
