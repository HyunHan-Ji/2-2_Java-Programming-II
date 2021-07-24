package week05_;

public class Customer extends Person {
	private String gubun;
	private int point;

	public Customer(String name, int age, char gubun, int point) {
		super(name, age);
		this.point = point;
		if (gubun == 'g' || gubun == 'G') {
			this.gubun = "일반";
		} else if (gubun == 'v' || gubun == 'V') {
			this.gubun = "우수";
		} else if (gubun == 's' || gubun == 'S') {
			this.gubun = "최우수";
		}

	}

	public int getPoint() {
		return point;
	}

	@Override
	public void diPlay() {
		super.diPlay();
		System.out.printf("고객구분: %s\t포인트: %d\n", gubun, point);
	}

	public void addPoint(int point) {
		this.point += point;
	}
}
