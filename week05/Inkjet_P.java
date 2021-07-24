package week05;

public class Inkjet_P extends Printer {
	private int remain;

	public Inkjet_P(String model, String comp, String itf, int number, int remain) {
		super(model, comp, number, itf);
		this.remain = remain;
	}

	public void print() {
		super.print();
		System.out.printf("À×Å© ÀÜ·®: %d]\n", remain);
	}

	public int inkdec(int a) {
		if (remain - a < 0) {
			return 0;
		}
		remain -= a;
		return remain;
	}
}
