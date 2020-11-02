package by.metelsky.classes.simpleclasses.task7;

public class TriangleLogic {

	private static final TriangleLogic instance = new TriangleLogic();

	private TriangleLogic() {

	}

	public final static TriangleLogic getInstance() {
		return instance;
	}

	public double getTriangleArea(Triangle triangle) {
		return Math.abs((triangle.getVerticesA().getVerticesX() * (triangle.getVerticesB().getVerticesY() - triangle.getVerticesC().getVerticesY()) + triangle.getVerticesB().getVerticesX() *(triangle.getVerticesC().getVerticesY() - triangle.getVerticesA().getVerticesY()) + 
				triangle.getVerticesC().getVerticesX() * (triangle.getVerticesA().getVerticesY() - triangle.getVerticesB().getVerticesY()))/2);
	

	}

	public double getTrianglePerimetr(Triangle triangle) {
		double[] sides = getSides(triangle);
		
		return sides[0] + sides[1] +sides[2];

	}

	public double[] getCentroidO(Triangle triangle) {
		double[] centroidO = new double[2];
		centroidO[0] = (triangle.getVerticesA().getVerticesX() + triangle.getVerticesB().getVerticesX() + triangle.getVerticesC().getVerticesX()) / 3.0;
		centroidO[1] = (triangle.getVerticesA().getVerticesY() + triangle.getVerticesB().getVerticesY() + triangle.getVerticesC().getVerticesY()) / 3.0;
		return centroidO;
	}
	
	public double[] getSides(Triangle triangle) {
		double[] sides = new double[3];
		sides[0] = Math.sqrt(Math.pow(triangle.getVerticesA().getVerticesX()-triangle.getVerticesB().getVerticesX(), 2) + Math.pow(triangle.getVerticesA().getVerticesY() - triangle.getVerticesB().getVerticesY(), 2));
		sides[1] = Math.sqrt(Math.pow(triangle.getVerticesB().getVerticesX()-triangle.getVerticesC().getVerticesX(), 2) + Math.pow(triangle.getVerticesB().getVerticesY() - triangle.getVerticesC().getVerticesY(), 2));
		sides[2] = Math.sqrt(Math.pow(triangle.getVerticesC().getVerticesX()-triangle.getVerticesA().getVerticesX(), 2) + Math.pow(triangle.getVerticesC().getVerticesY() - triangle.getVerticesA().getVerticesY(), 2));
		return sides;
	}



}
