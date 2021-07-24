package week05;

abstract class Cal {
	protected int a, b;
	protected char op;

	protected Cal(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("슈퍼클래스 생성자");
	}

	protected abstract int calculate();

	public String toString() {
		return "[ result ] " + a + op + b + " = " + calculate();
	}
}
