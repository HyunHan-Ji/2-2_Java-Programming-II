package week12;

import java.util.*;

public class BookTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Book> list = new ArrayList<Book>();
		/*
		 * list.add(new Book("1234", "Java", "John")); list.add(new Book("2345", "C",
		 * "Annie")); list.add(new Book("5678", "Python", "Tom"));
		 */
		while (true) {
			System.out.print("�޴�: 1.����  2.����  3.�˻�  4.����Ʈ ���  5.����  6.����  -->");
			int menu = scan.nextInt();
			if (menu == 1) {
				System.out.print("���� �޴�\n������ȣ ���� ���� �Է�: ");
				list.add(new Book(scan.next(), scan.next(), scan.next()));
			} else if (menu == 2) {
				System.out.print("���� �޴� �Դϴ�\n�����ϰ��� �ϴ� å ������ �Է�: ");
				String str = scan.next();
				for (int i = 0; i < list.size(); i++) {
					if (str.equals(list.get(i).getTitle())) {
						list.get(i).rentBook();
						break;
					}
				}
			} else if (menu == 3) {
				System.out.print("�˻� �޴�\n�˻��ϰ��� �ϴ� å ������ �Է�: ");
				String str = scan.next();
				System.out.println("������ȣ\t����\t����\t���� ����");
				for (int i = 0; i < list.size(); i++) {
					if (str.equals(list.get(i).getTitle())) {
						System.out.println(list.get(i));
						break;
					}
				}
			} else if (menu == 4) {
				System.out.println("��ü ���");
				System.out.println("������ȣ\t����\t����\t���� ����");
				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i));
				}
			} else if (menu == 5) {
				System.out.print("���� �޴�\n������ȣ �Է�: ");
				String str = scan.next();
				for (int i = 0; i < list.size(); i++) {
					if (str.equals(list.get(i).getNumber())) {
						list.remove(i);
					}
				}
			} else if (menu == 6) {
				System.out.println("�����մϴ�.");
				break;
			} else {
				System.out.println("�Է¿���");
			}
		}
	}

}
