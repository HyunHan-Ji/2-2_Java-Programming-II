package week05_;

public class Coffee extends Menu {
	protected boolean b;

	final int AMERICANO = 2000;
	final int LATTE = 3000;
	final int SYRUP = 500;

	public Coffee(String name, int cnt, boolean b) {
		super(name, cnt);
		this.b = b;

		if (name.equals("아메리카노")) {
			unit_price = AMERICANO;
		} else if (name.equals("카페라떼")) {
			unit_price = LATTE;
		}
		total += unit_price * cnt;
	}

	@Override
	public void write() {
		super.write();
		System.out.print("추가사항: ");
		if (b) {
			System.out.println("시럽 추가");
		} else {
			System.out.println("시럽 추가 없음");
		}
	}
}