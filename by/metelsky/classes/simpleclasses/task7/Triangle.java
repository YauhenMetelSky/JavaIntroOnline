package by.metelsky.classes.simpleclasses.task7;
/*
 * Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов,
 *  вычисления площади, периметра и точки пересечения медиан.
 *  http://www.treugolniki.ru/tochka-peresecheniya-median/
 *  треугольник задается координатами??
 */
// создать триангл лоджик, вынести методы ареа, центроид и сторона туда.
public class Triangle {
	
	private Vertices verticesA;
	private Vertices verticesB;
	private Vertices verticesC;
	
	
	public Triangle() {
		}
	

	public Triangle(Vertices verticesA, Vertices verticesB, Vertices verticesC) {
		super();
		this.verticesA = verticesA;
		this.verticesB = verticesB;
		this.verticesC = verticesC;
	}


	public Vertices getVerticesA() {
		return verticesA;
	}

	public Vertices getVerticesB() {
		return verticesB;
	}

	public Vertices getVerticesC() {
		return verticesC;
	}


	public void setVerticesA(Vertices verticesA) {
		this.verticesA = verticesA;
	}


	public void setVerticesB(Vertices verticesB) {
		this.verticesB = verticesB;
	}


	public void setVerticesC(Vertices verticesC) {
		this.verticesC = verticesC;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((verticesA == null) ? 0 : verticesA.hashCode());
		result = prime * result + ((verticesB == null) ? 0 : verticesB.hashCode());
		result = prime * result + ((verticesC == null) ? 0 : verticesC.hashCode());
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
		Triangle other = (Triangle) obj;
		if (verticesA == null) {
			if (other.verticesA != null)
				return false;
		} else if (!verticesA.equals(other.verticesA))
			return false;
		if (verticesB == null) {
			if (other.verticesB != null)
				return false;
		} else if (!verticesB.equals(other.verticesB))
			return false;
		if (verticesC == null) {
			if (other.verticesC != null)
				return false;
		} else if (!verticesC.equals(other.verticesC))
			return false;
		return true;
	}
	

}
