package week05;

import java.util.*;

public class TestDraw {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ShapeDraw SD = null;

		System.out.println("1.Rectangle 2.Triangle 3.Ladder 4.Finish");
		System.out.print("�޴��� �����ϼ���: ");
		int menu = scan.nextInt();
		System.out.print("��ũ�⸦ �Է��ϼ���: ");
		int x = scan.nextInt();
		System.out.print("���ڸ� �Է��ϼ���: ");
		char ch = scan.next().charAt(0);

		if (menu == 1) {
			SD = new Rectangle();
		} else if (menu == 2) {
			SD = new Triangle();
		} else if (menu == 3) {
			SD = new Ladder();
		} else if (menu == 4) {
			return;
		}
		SD.draw(x, ch);
	}
}
