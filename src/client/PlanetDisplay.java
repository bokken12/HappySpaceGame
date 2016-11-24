package client;

import java.awt.Graphics;

import javax.swing.JPanel;

import world.Planet;

public class PlanetDisplay extends JPanel {

	Planet displaying;
	
	public PlanetDisplay(Planet displaying) {
		this.displaying = displaying;
	}
	
	@Override
	public void paintComponent(Graphics g) {
		
	}
}
