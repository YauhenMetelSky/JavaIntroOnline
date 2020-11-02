package by.metelsky.classes.simpleclasses.task7;

public class Vertices {
	private int verticesX;
	private int verticesY;
	
	public Vertices() {
		
	}
	
	public Vertices(int x, int y) {
		this.verticesX = x;
		this.verticesY = y;
		
	}

	public int getVerticesX() {
		return verticesX;
	}

	public void setVerticesX(int verticesX) {
		this.verticesX = verticesX;
	}

	public int getVerticesY() {
		return verticesY;
	}

	public void setVerticesY(int verticesY) {
		this.verticesY = verticesY;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + verticesX;
		result = prime * result + verticesY;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vertices other = (Vertices) obj;
		if (verticesX != other.verticesX)
			return false;
		if (verticesY != other.verticesY)
			return false;
		return true;
	}
	

}
