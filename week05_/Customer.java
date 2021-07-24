package week05_;

public class Customer extends Person {
	private String gubun;
	private int point;

	public Customer(String name, int age, char gubun, int point) {
		super(name, age);
		this.point = point;
		if (gubun == 'g' || gubun == 'G') {
			this.gubun = "�Ϲ�";
		} else if (gubun == 'v' || gubun == 'V') {
			this.gubun = "���";
		} else if (gubun == 's' || gubun == 'S') {
			this.gubun = "�ֿ��";
		}

	}

	public int getPoint() {
		return point;
	}

	@Override
	public void diPlay() {
		super.diPlay();
		System.out.printf("������: %s\t����Ʈ: %d\n", gubun, point);
	}

	public void addPoint(int point) {
		this.point += point;
	}
}
