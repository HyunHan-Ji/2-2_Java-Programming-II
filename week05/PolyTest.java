package week05;
/*
public class PolyTest {
	public static void draw(Shape[] shape) {
		for (Shape s : shape) {
			s.draw();
			if (s instanceof Rectangle) // ��ü s�� Rectangle Ÿ���̸�
				System.out.println("���� : " + ((Rectangle) s).getArea());
			else if (s instanceof Circle)
				System.out.printf("�� �ѷ� : %.2f\n", ((Circle) s).getCircum());
		}
	}

	public static void main(String[] args) {
		Poly[] choice = Poly.values(); // ���� ��ü�� �迭�� ��ȯ
		Shape[] shape = new Shape[4];
		for (int i = 0; i < shape.length; i++) {
			int rnd = (int) (Math.random() * 3);
			int x = (int) (Math.random() * 100) + 1;
			int y = (int) (Math.random() * 100) + 1;
			switch (choice[rnd]) {
			case Rectangle:
				shape[i] = new Rectangle(x, y);
				((Rectangle) shape[i]).setArea(x, y);
				break;
			case Triangle:
				shape[i] = new Triangle(x, y);
				break;
			case Circle:
				shape[i] = new Circle(x, y);
				((Circle) shape[i]).setCircum(Math.random() * 10);
			}
		}
		draw(shape);
	}
}*/