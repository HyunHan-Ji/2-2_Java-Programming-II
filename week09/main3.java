package week09;

import java.util.Scanner;

public class main3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = "�ڹ� ���α׷��� ��� �����ϴ�. ��ƽ��ϴ�";

		System.out.print("���ڸ� �Է��ϼ��� >>>> ");
		char ch = scan.next().charAt(0);
		if (str.indexOf(ch) == -1) {
			System.out.printf("%c��(��) �ش� ���ڿ��� �����ϴ�\n", ch);
		} else {
			System.out.printf("%c��(��) %d��°�� �ֽ��ϴ�\n", ch, str.indexOf(ch) + 1);
		}
		System.out.println("���α׷� ����");
	}
}
