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
		System.out.printf("메뉴: %s\t수량: %d\t단가: %d\t금액: %d\n", name, cnt, unit_price, total);
	}

	public int getTotal() {
		return total;
	}
}
