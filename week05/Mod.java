package week05;

public class Mod extends Cal {

	protected Mod(int a, int b, char op) {
		super(a, b);
		this.op = op;
		System.out.println("Mod »ý¼ºÀÚ");
	}

	@Override
	protected int calculate() {
		return a % b;
	}
}
