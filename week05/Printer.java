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
		System.out.printf("Printer [�𵨸�=%s, ����ȸ���=%s, �������̽�����=%s, �μ�ż�=%d ",model, comp, itf, number);
	}
}
