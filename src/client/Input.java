package client;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Input implements MouseListener, KeyListener {
	
	GameClient game;
	
	public Input(GameClient g) {
		game = g;
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		moveCamera(e);
	}
	
	public void moveCamera(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			game.mapDisplay.cameraPosition.x -= 1;
		}
		else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			game.mapDisplay.cameraPosition.x += 1;
		}
		else if(e.getKeyCode() == KeyEvent.VK_UP) {
			game.mapDisplay.cameraPosition.y += 1;
		}
		else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			game.mapDisplay.cameraPosition.y -= 1;
		}
		game.mapDisplay.repaint();
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
