package week05_;

public class Coffee extends Menu {
	protected boolean b;

	final int AMERICANO = 2000;
	final int LATTE = 3000;
	final int SYRUP = 500;

	public Coffee(String name, int cnt, boolean b) {
		super(name, cnt);
		this.b = b;

		if (name.equals("�Ƹ޸�ī��")) {
			unit_price = AMERICANO;
		} else if (name.equals("ī���")) {
			unit_price = LATTE;
		}
		total += unit_price * cnt;
	}

	@Override
	public void write() {
		super.write();
		System.out.print("�߰�����: ");
		if (b) {
			System.out.println("�÷� �߰�");
		} else {
			System.out.println("�÷� �߰� ����");
		}
	}
}