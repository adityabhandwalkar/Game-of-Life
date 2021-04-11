package exercise1;

import java.awt.Color;

import processing.core.PApplet;

public class Rectangle {
	int x;
	int y;
	int width;
	int height;
	


	public Rectangle (int width, int height,int x, int y) {
		this.width= width;
		this.height= height;
		this.x= x;
		this.y = y;
	}

	public void draw (Color col, PApplet app ) {
		app.fill(col.getRGB());
		app.rect((float) x, (float) y, (float) width, (float) height);
		


 }
	}