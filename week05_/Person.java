package week05_;

public abstract class Person {
	protected String name;
	protected int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void diPlay() {
		System.out.printf("�̸�: %s\t����: %d\t", name, age);
	}
}
