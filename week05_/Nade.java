package week05_;

public class Nade extends Menu {
	protected boolean b;

	final int LEMONADE = 3500;
	final int CHAMOMILE = 2000;

	public Nade(String name, int cnt, boolean b) {
		super(name, cnt);
		this.b = b;
		if (name.equals("������̵�")) {
			unit_price = LEMONADE;
		} else if (name.equals("�ɸ���")) {
			unit_price = CHAMOMILE;
		}
		total = unit_price * cnt;
	}

	@Override
	public void write() {
		super.write();
		System.out.print("�߰�����: ");
		if (b) {
			System.out.println("������ ����");
		} else {
			System.out.println("�ÿ��� ����");
		}
	}
}
