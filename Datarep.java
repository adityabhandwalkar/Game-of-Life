//Aditya Bhandwalkar 122027
//  removing comment each pattern could be processed to get next generation commenting others. 

package exercise1;

import java.awt.Color;

import processing.core.PApplet;

public class Datarep extends PApplet{
	static int m = 40;
	static int n = 40;
	static String p = " . "; 
	static String[][] a = new String [m][n];

	public static String[][] nextgen = new String [m][n];
	public static String[][] future = new String [m][n];


	public static void main(String[] args)   {

		String[][] pattern2 = new String [m][n];
		PApplet.main(exercise1.Datarep.class);

		for (int i = 0; i< m; i++) {
			for (int j = 0; j <n; j++) {
				// pattern 2
				if (i == 22 && j== 18 || i== 22 && j == 21 ||
						i == 21 && j ==22 || i == 20 && j == 22  ||
						i == 19 && j == 22  || i == 19 && j == 21  ||
						i == 19 && j == 20  || i == 19 && j == 19 || i == 20 && j == 18)
					//pattern 1
					//if(i == 20 && j == 20 || i == 20 && j == 19 || i == 19 && j == 19 || i == 19  && j == 20) 
						 // pattern 3
						//if (i == 16 && j == 20|| i ==17 && j ==19|| i == 18 && j == 19 || i == 18&& j ==20 || i ==18 && j ==21 || i == 22&& j ==18 || i == 22 && j ==19 || i == 23&& j ==18 || i == 23 && j ==19)
				
				{
					pattern2[i][j]= " * ";
				}
				else {
					pattern2[i][j]= p ;
				}
				System.out.print(pattern2[i][j]); 
			}
			System.out.println();
		}

		
		for (int k = 0; k < 20; k++) {
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					Controller C = new Controller(i, j, pattern2, nextgen);
					String B = C.controller(i, j, pattern2, nextgen);
					future[i][j] = B;
					System.out.print(B);
				}
 				System.out.println();
			}
			for (int i = 0; i < future.length; i++) {
				for (int j = 0; j < future.length; j++) {
					pattern2[i][j] = future[i][j].toString();
				}
			}
		}
	}
	
	public void settings() {
		size(1000, 1000);
	}
	
	public void draw () {
		for(int i = 0; i < future.length; i++) {
			for (int j = 0; j < future.length; j++) {
				if(future[j][i]== p) {
					Rectangle Rect = new Rectangle (10,10,i*10,j*10);
					Rect.draw(Color.GRAY,this);
				}
				else if (future[j][i]== " * ") {
					Rectangle Rect = new Rectangle (10,10,i*10,j*10);
					Rect.draw(Color.YELLOW,this);
				}
			}
		}
	}
}