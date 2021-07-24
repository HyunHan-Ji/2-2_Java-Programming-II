package week05;

public class Add extends Cal {

	protected Add(int a, int b, char op) {
		super(a, b);
		this.op = op;
		System.out.println("Add »ý¼ºÀÚ");
	}

	@Override
	protected int calculate() {
		return a + b;
	}
}
