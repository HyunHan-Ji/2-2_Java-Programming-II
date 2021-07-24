package week07;

public class Rectangle implements GraphicsObject {
	private int length;
	private int width;

	void setDimensions(int i, int w) {
		length = i;
		width = w;
	}

	@Override
	public void draw() {
		System.out.printf("���̰� %d�� �簢���� �׸��ϴ�.", getArea());
	}

	@Override
	public int getArea() {
		return length * width;
	}
}
