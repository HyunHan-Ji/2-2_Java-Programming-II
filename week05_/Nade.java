package week05_;

public class Nade extends Menu {
	protected boolean b;

	final int LEMONADE = 3500;
	final int CHAMOMILE = 2000;

	public Nade(String name, int cnt, boolean b) {
		super(name, cnt);
		this.b = b;
		if (name.equals("레모네이드")) {
			unit_price = LEMONADE;
		} else if (name.equals("케모마일")) {
			unit_price = CHAMOMILE;
		}
		total = unit_price * cnt;
	}

	@Override
	public void write() {
		super.write();
		System.out.print("추가사항: ");
		if (b) {
			System.out.println("따뜻한 음료");
		} else {
			System.out.println("시원한 음료");
		}
	}
}
