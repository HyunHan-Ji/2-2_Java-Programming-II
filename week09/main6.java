package week09;

import java.util.Scanner;

public class main6 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String words[] = { "������", "����", "�ݼ���", "����", "����", "����", "��å" };

		do {
			System.out.println("���� �ձ� ������ �����մϴ�~~~");
			String str = words[(int) (Math.random() * words.length)];
			
			while (true) {
				System.out.printf("%s�� %c�� �����ϴ� �ܾ� >> ", str, str.charAt(str.length() - 1));
				String inputstr = scan.next();
				if (inputstr.charAt(0) == str.charAt(str.length() - 1)) {
					str = inputstr;
				} else {
					System.out.println("Ʋ�Ƚ��ϴ�.");
					break;
				}
			}
			
			
			System.out.print("����ϰڽ��ϴ� ? >> ");
			if (scan.next().charAt(0) == 'n'){
				System.out.println("������ �����մϴ�");
				break;
			}
		} while (true);
	}
}
