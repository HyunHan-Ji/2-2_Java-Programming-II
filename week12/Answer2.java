package week12;

import java.util.Scanner;

public class Answer2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	

		while (true) {
			try {
				System.out.print(">> id를 입력하세요 _ ");
				Id.idcheck(scan.next());
				System.out.println("program finish");
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

class Id {
	static void idcheck(String id) throws Exception {
		if (id.length() < 8 || !Character.isAlphabetic(id.charAt(0))) {
			System.out.println(id+"는 사용할 수 없는 아이디 입니다.");
			throw new Exception("첫글자는 영문자 이거나 길이는 8이상 이어야 합니다.");
		}else {
			System.out.println(id+"는 사용할 수 있는 아이디 입니다.");
		}
	}
}