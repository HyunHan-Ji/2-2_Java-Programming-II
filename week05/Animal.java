package week05;

class Animal {
	String name;

	public Animal() {
		name = "UNKNOWN";
		System.out.println("�����Դϴ�:" + name);
	}

	public Animal(String name) {
		this.name = name;
		System.out.println("�����Դϴ�:" + name);
	}
}

class Lion extends Animal {
	public Lion() {
		System.out.println("�����Դϴ�.");
	}

	public Lion(String name) {
		super(name);
		System.out.println("�����Դϴ�.");
	}
}