package week05_;

public class Icecream extends Menu {
	protected int t;

	final int WAFFLE = 5000;

	public Icecream(String name, int cnt, int t) {
		super(name, cnt);
		this.t = t;

		total += WAFFLE * cnt;
	}

	@Override
	public void write() {
		super.write();
		System.out.print("��������: ");
		if (t == 1) {
			System.out.println("�ٴҶ�");
		} else if (t == 2) {
			System.out.println("��纣��");
		} else if (t == 3) {
			System.out.println("�ٳ���");
		}
	}
}
