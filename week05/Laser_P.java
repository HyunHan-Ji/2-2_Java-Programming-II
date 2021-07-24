package week05;

public class Laser_P extends Printer {
	private int remain;

	public Laser_P(String model, String comp, String itf, int number, int remain) {
		super(model, comp, number, itf);
		this.remain = remain;
	}

	public void print() {
		super.print();
		System.out.printf("≈‰≥  ¿‹∑Æ: %d]\n", remain);
	}

	public int inkdec(int a) {
		if (remain - a < 0) {
			return 0;
		}
		remain -= a;
		return remain;
	}
}