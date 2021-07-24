package week09;

import java.util.Scanner;

public class main6 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String words[] = { "강아지", "지금", "금수저", "저장", "생강", "강산", "산책" };

		do {
			System.out.println("끝말 잇기 게임을 시작합니다~~~");
			String str = words[(int) (Math.random() * words.length)];
			
			while (true) {
				System.out.printf("%s의 %c로 시작하는 단어 >> ", str, str.charAt(str.length() - 1));
				String inputstr = scan.next();
				if (inputstr.charAt(0) == str.charAt(str.length() - 1)) {
					str = inputstr;
				} else {
					System.out.println("틀렸습니다.");
					break;
				}
			}
			
			
			System.out.print("계속하겠습니다 ? >> ");
			if (scan.next().charAt(0) == 'n'){
				System.out.println("게임을 종료합니다");
				break;
			}
		} while (true);
	}
}
