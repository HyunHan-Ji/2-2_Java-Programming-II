package week05;

public class Triangle extends ShapeDraw {
	@Override
	public void draw(int x, char ch) {
		for (int i = 0; i < x; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}
