package week09;

import java.util.Scanner;

public class main4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = null;
		while (true) {
			System.out.print("문자열 입력: ");
			str = scan.next();
			if (str.equals("finish")) {
				System.out.println("프로그램 종료");
				break;
			}

			String rvstr = "";
			for (int i = str.length() - 1; i >= 0; i--) {
				rvstr += str.charAt(i);
			}
			System.out.println(rvstr);
		}
	}
}
