package week12;

import java.util.Scanner;

public class Answer2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	

		while (true) {
			try {
				System.out.print(">> id�� �Է��ϼ��� _ ");
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
			System.out.println(id+"�� ����� �� ���� ���̵� �Դϴ�.");
			throw new Exception("ù���ڴ� ������ �̰ų� ���̴� 8�̻� �̾�� �մϴ�.");
		}else {
			System.out.println(id+"�� ����� �� �ִ� ���̵� �Դϴ�.");
		}
	}
}