package week05;

public class Mod extends Cal {

	protected Mod(int a, int b, char op) {
		super(a, b);
		this.op = op;
		System.out.println("Mod ������");
	}

	@Override
	protected int calculate() {
		return a % b;
	}
}
