package week05;

import java.util.*;

public class TestDraw {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ShapeDraw SD = null;

		System.out.println("1.Rectangle 2.Triangle 3.Ladder 4.Finish");
		System.out.print("메뉴를 선택하세요: ");
		int menu = scan.nextInt();
		System.out.print("행크기를 입력하세요: ");
		int x = scan.nextInt();
		System.out.print("문자를 입력하세요: ");
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
