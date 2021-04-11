package exercise1;

import java.awt.Point;
import java.util.ArrayList;

public class Controller {
	ArrayList<Point> Neighbour  = new ArrayList<Point> (); 
	int dead =  0;
	int alive = 0;
	int i,j;
	String[][] C;
	public  Controller(int i, int j,String[][] C, String [][] nextgen) {
		this.i= i ;
		this.j=j;
		this.C= C;
	}

	public String controller(int i, int j,String[][] C,String [][] nextgen) {
		// TODO Auto-generated constructor stub
		// for corners
		if (i == 0 && j==0) {
			Neighbour.add(new Point(i,j+1));
			Neighbour.add(new Point(i+1,j));
			Neighbour.add(new Point(i+1,j+1));
		}
		else if (i == 0 && j == 39) {
			Neighbour.add(new Point(i,j-1));
			Neighbour.add(new Point(i+1,j));
			Neighbour.add(new Point(i+1,j-1));

		}
		else if (i == 39 && j == 39) {
			Neighbour.add(new Point(i-1,j));
			Neighbour.add(new Point(i,j-1));
			Neighbour.add(new Point(i-1,j-1));
		}
		else if (i == 39 && j == 0) {
			Neighbour.add(new Point(i-1,j));
			Neighbour.add(new Point(i,j+1));
			Neighbour.add(new Point(i-1,j+1));
		}
		// for edge 
		else if (i == 0) {
			Neighbour.add(new Point(i,j-1));
			Neighbour.add(new Point(i,j+1));
			Neighbour.add(new Point(i+1,j));
			Neighbour.add(new Point(i+1,j-1));
			Neighbour.add(new Point(i+1,j+1));
		}
		else if ( j == 39) {
			Neighbour.add(new Point(i-1,j));
			Neighbour.add(new Point(i+1,j));
			Neighbour.add(new Point(i,j-1));
			Neighbour.add(new Point(i-1,j-1));
			Neighbour.add(new Point(i+1,j-1));
		}
		else if (i == 39) {
			Neighbour.add(new Point(i,j-1));
			Neighbour.add(new Point(i,j+1));
			Neighbour.add(new Point(i-1,j));
			Neighbour.add(new Point(i-1,j-1));
			Neighbour.add(new Point(i-1,j+1));
		}
		else if ( j == 0) {
			Neighbour.add(new Point(i-1,j));
			Neighbour.add(new Point(i+1,j));
			Neighbour.add(new Point(i,j+1));
			Neighbour.add(new Point(i-1,j+1));
			Neighbour.add(new Point(i+1,j+1));
		}
		// for middle 
		 else  {
			Neighbour.add(new Point(i+1,j));
			Neighbour.add(new Point(i-1,j));
			Neighbour.add(new Point(i,j+1));
			Neighbour.add(new Point(i,j-1));
			Neighbour.add(new Point(i-1,j-1));
			Neighbour.add(new Point(i+1,j-1));
			Neighbour.add(new Point(i+1,j+1));
			Neighbour.add(new Point(i-1,j+1));

		}
		for ( int k = 0; k < Neighbour.size(); k++ ) {

			if (C [Neighbour.get(k).x] [Neighbour.get(k).y] == " . ") {
				dead ++;
			}
			else if (C [Neighbour.get(k).x] [Neighbour.get(k).y] == " * ")
			{
				alive ++;
			}
 
		}

		if (alive == 3 && C[i][j]== " . "  ) {
			nextgen[i][j] = " * ";
		}
		else if (C[i][j]== " * " &&  alive < 2) {
			nextgen[i][j]= " . ";
		}
		else if (C[i][j]== " * " &&  alive>=2 && alive <= 3 ) {

			nextgen[i][j]= " * ";
		}
		else if (C[i][j]== " * " && alive>3) {
			nextgen[i][j]= " . ";

		}
		else {
			nextgen[i][j]= " . ";
		}
		return nextgen[i][j] ;
	}
}









