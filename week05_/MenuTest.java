package week05_;

import java.util.*;

public class MenuTest {
	public static int menu(Scanner key) {
		String menu = "1. �Ƹ޸�ī��     2. ī���   3.������̵�    4.�ɸ���   5.����  6. ����  --> ";
		System.out.print(menu);
		return key.nextInt();
	}

	public static int count(Scanner key, String message) {
		System.out.print(message + " --> ");
		return key.nextInt();
	}

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		Menu[] menu = new Menu[10];
		boolean b;
		int hap = 0, t, i = 0;

		while (true) {
			int choice = menu(key);
			if (choice == 6)
				break;
			int cnt = count(key, "������ �Է��ϼ��� : ");

			switch (choice) {
			case 1:
				b = count(key, "1. �÷��߰�  2.�÷��߰� ����") == 1 ? true : false;
				menu[i++] = new Coffee("�Ƹ޸�ī��", cnt, b);
				break;
			case 2:
				b = count(key, "1. �÷��߰�  2.�÷��߰� ����") == 1 ? true : false;
				menu[i++] = new Coffee("ī���", cnt, b);
				break;
			case 3:
				b = count(key, "1. ������ ����  2. �ÿ��� ����") == 1 ? true : false;
				menu[i++] = new Nade("������̵�", cnt, b);
				break;
			case 4:
				b = count(key, "1. ������ ����  2. �ÿ��� ����") == 1 ? true : false;
				menu[i++] = new Nade("�ɸ���", cnt, b);
				break;
			case 5:
				t = count(key, "1. �ٴҶ�  2. ��纣�� 3. �ٳ���");
				menu[i++] = new Icecream("����", cnt, t);
				break;
			default:
				System.out.println("�߸� �Է��Ͽ����ϴ�");
			}

		}
		System.out.println("\n�ֹ��Ͻ� �� ������ ����մϴ�");
		for (int j = 0; j < i; j++) {
			menu[j].write();
			hap += menu[j].getTotal();
		}
		System.out.println("�� �ݾ� : " + hap);
		System.out.println("���α׷��� �����մϴ�");
	}
}
