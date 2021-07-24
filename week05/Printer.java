package week05;

public class Printer {
	protected String model;
	protected String comp;
	protected int number;
	protected String itf;

	public Printer(String model, String comp, int number, String itf) {
		this.model = model;
		this.comp = comp;
		this.number = number;
		this.itf = itf;
	}

	public void print() {
		System.out.printf("Printer [모델명=%s, 제조회사명=%s, 인터페이스종류=%s, 인쇄매수=%d ",model, comp, itf, number);
	}
}
