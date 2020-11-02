package by.metelsky.classes.simpleclasses.task7;

import java.io.ObjectInputStream.GetField;

public class Main {
	
	public static void main (String [] args) {
		Triangle triangle = new Triangle(new Vertices(9,9),new Vertices(19,29),new Vertices(39,17));
		TriangleLogic tLogic = TriangleLogic.getInstance();
		System.out.println("Area is: " +tLogic.getTriangleArea(triangle));
		System.out.println("Perimetr is: " + tLogic.getTrianglePerimetr(triangle) );
		System.out.println("Centroid O has coordinates x = " + tLogic.getCentroidO(triangle)[0] + " y = " + tLogic.getCentroidO(triangle)[1]);
		
	}

}
