package week05_;

public class Menu {
	protected String name;
	protected int cnt;
	protected int total;
	protected int unit_price;

	public Menu(String name, int cnt) {
		this.name = name;
		this.cnt = cnt;
	}

	public void write() {
		System.out.printf("�޴�: %s\t����: %d\t�ܰ�: %d\t�ݾ�: %d\n", name, cnt, unit_price, total);
	}

	public int getTotal() {
		return total;
	}
}
