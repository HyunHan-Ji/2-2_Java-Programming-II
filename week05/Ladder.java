package week05;

public class Ladder extends ShapeDraw {
	@Override
	public void draw(int x, char ch) {
		for (int i = 0; i < x; i++) {
			for (int j = 2; j <= x - i; j++) { // �������
				System.out.print(" ");
			}
			for (int j = 0; j <= i + 1; j++) { // �������
				System.out.printf("%c%c", ch, ch);
			}

			System.out.println();
		}
	}
}
