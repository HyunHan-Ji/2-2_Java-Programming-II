package week05;

import java.util.*;

public class EmployeeTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("1: Salaried ��ü ����, 2: Hour ��ü ����, 3.���� --> ");
			int menu = scan.nextInt();

			if (menu == 1) {
				System.out.println("�̸�, ���, �޿��� �Է��ϼ���");
				SalariedEmployee salariedEmployee = new SalariedEmployee(scan.next(), scan.nextInt(), scan.nextInt());
				System.out.println(salariedEmployee);
			} else if (menu == 2) {
				System.out.println("�̸�, ���, �ð����ӱ�, �ð��� �Է��ϼ���");
				HourEmployee hourEmployee = new HourEmployee(scan.next(), scan.nextInt(), scan.nextInt(),
						scan.nextInt());
				System.out.println(hourEmployee);
			} else if (menu == 3) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else {
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}
		}
	}
}
