package week09;

import java.util.Scanner;

public class main3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = "자바 프로그램은 재미 없습니다. 어렵습니다";

		System.out.print("문자를 입력하세요 >>>> ");
		char ch = scan.next().charAt(0);
		if (str.indexOf(ch) == -1) {
			System.out.printf("%c는(은) 해당 문자열에 없습니다\n", ch);
		} else {
			System.out.printf("%c는(은) %d번째에 있습니다\n", ch, str.indexOf(ch) + 1);
		}
		System.out.println("프로그램 종료");
	}
}
