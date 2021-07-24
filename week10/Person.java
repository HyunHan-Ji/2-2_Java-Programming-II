package week10;

class Person implements Comparable<Person> {
	private String name;
	private double height;

	public String toString() {
		return "Person [name=" + name + ", height=" + height + "]";
	}

	public Person(String name, double height) {
		this.name = name;
		this.height = height;
	}

	@Override
	public int compareTo(Person o) {
		return Double.compare(height, o.height);
	}
}
