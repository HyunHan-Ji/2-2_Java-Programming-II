package week07;

public class Person implements Comparable {
	private String name;
	private double height;

	public Person(String name, double height) {
		this.name = name;
		this.height = height;
	}

	@Override
	public int compareTo(Object arg0) {
		if (this.height > ((Person) arg0).height) {
			return 1;
		} else if (this.height < ((Person) arg0).height) {
			return -1;
		} else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return "[name=" + name + ", height=" + height + "]";
	}

}
