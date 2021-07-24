package week04;

public class Distance {
	private String name;
	private int dist;
	
	Distance(String name, int dist){
		this.name = name;
		this.dist = dist;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDist() {
		return dist;
	}

	public void setDist(int dist) {
		this.dist = dist;
	}

	public String toString() {
		return "Distance[이름 =" + name + ", 통학거리=" + dist +"]";
	}
	
	
}
