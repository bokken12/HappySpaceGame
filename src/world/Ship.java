package world;

import java.awt.Point;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Ship {

	Point location;
	ArrayList<Item> hold;
	int money;
	int speed;
	int health;
	int attack;
	public ImageIcon image;
	
	public Ship() {
		
	}

	/**
	 * @return the location
	 */
	public Point getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(Point location) {
		this.location = location;
	}

	/**
	 * @return the hold
	 */
	public ArrayList<Item> getHold() {
		return hold;
	}

	/**
	 * @param hold the hold to set
	 */
	public void setHold(ArrayList<Item> hold) {
		this.hold = hold;
	}

	/**
	 * @return the money
	 */
	public int getMoney() {
		return money;
	}

	/**
	 * @param money the money to set
	 */
	public void setMoney(int money) {
		this.money = money;
	}

	/**
	 * @return the speed
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	/**
	 * @return the health
	 */
	public int getHealth() {
		return health;
	}

	/**
	 * @param health the health to set
	 */
	public void setHealth(int health) {
		this.health = health;
	}

	/**
	 * @return the attack
	 */
	public int getAttack() {
		return attack;
	}

	/**
	 * @param attack the attack to set
	 */
	public void setAttack(int attack) {
		this.attack = attack;
	}

	/**
	 * @return the image
	 */
	public ImageIcon getImage() {
		return image;
	}

	/**
	 * @param image the image to set
	 */
	public void setImage(ImageIcon image) {
		this.image = image;
	}
	
}
