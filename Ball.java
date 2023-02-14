package Game;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Ball extends Rectangle {
	
	Random random;
	int xVelocity; // movement speed on x-axis
	int yVelocity; // movement speed on y-axis
	int initionalSpeed = 2;
	Ball(int x, int y, int width, int height) {
		super(x, y, width, height);
		random = new Random();
		int randomXDirection = random.nextInt(2);
		if(randomXDirection == 0)
			randomXDirection--;
		setXDirection(randomXDirection * initionalSpeed);
		
		int randomYDirection = random.nextInt(2);
		if(randomYDirection == 0)
			randomYDirection--;
		setYDirection(randomYDirection * initionalSpeed);
	}
	public void setXDirection(int randomXDirection) {
		xVelocity = randomXDirection;
	}
	public void setYDirection(int randomYDirection) {
		yVelocity = randomYDirection;
	}
	public void move() {
		x += xVelocity;
		y += yVelocity;
	}
	public void draw (Graphics g) {
		g.setColor(Color.white);
		g.fillOval(x, y, height, width);
	}
}
