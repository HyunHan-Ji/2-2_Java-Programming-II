package week11;

import java.util.Scanner;

public class CustomerTest {

	public static void main(String[] args) {
		// �޴�ó��
		Scanner scan = new Scanner(System.in);
		CustomerManage cm = new CustomerManage();
		while (true) {
			System.out.print("1:ȸ������  2:ȸ��Ż��  3:��� ȸ�� ���� ���  4:���� ----> ");
			int menu = scan.nextInt();
			if (menu == 1) {
				System.out.print("�̸��� �Է��ϼ���: ");
				String name = scan.next();
				System.out.print("���̵� �Է��ϼ���: ");
				String cnum = scan.next();
				cm.add(new Customer(name, cnum));
			} else if (menu == 2) {
				System.out.print("���̵� �Է��ϼ���: ");
				cm.delete(scan.next());
			} else if (menu == 3) {
				cm.print();
			} else if (menu == 4) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else {
				System.out.println("�Է� ����");
			}
		}
	}
}
