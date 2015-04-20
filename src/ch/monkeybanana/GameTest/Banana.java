package ch.monkeybanana.GameTest;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class Banana {

	
	private Image image;
	
	private int x, y, type;
	private char direction;

	/**
	 * Erstellt ein neues Banananen Objekt mit den Koordinaten
	 * x, y und einem Typ.
	 * 
	 * @author Dominic Pfister
	 * @param x {@link int}
	 * @param y {@link int}
	 * @param type {@link int}
	 */
	public Banana(int x, int y, int type, char direction) {
		image =  new ImageIcon("images/banana.png").getImage();
		
		this.setX(x);
		this.setY(y);
		this.setType(type);
		this.setDirection(direction);
	}
	
	/**
	 * Gibt die Hitbox der Banane zur�ck
	 * 
	 * @author Dominic Pfister
	 */
	public Rectangle bananaBounds() {
		int height = this.getImage().getHeight(null);
		int y = this.getY() + 15;
		return new Rectangle(this.getX(), y, image.getWidth(null), height);
	}

	/* **GETTER und SETTER** */
	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public char getDirection() {
		return direction;
	}

	public void setDirection(char direction) {
		this.direction = direction;
	}
}
