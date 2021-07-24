package week05;

import java.util.*;

public class EmployeeTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("1: Salaried 객체 생성, 2: Hour 객체 생성, 3.종료 --> ");
			int menu = scan.nextInt();

			if (menu == 1) {
				System.out.println("이름, 사번, 급여를 입력하세요");
				SalariedEmployee salariedEmployee = new SalariedEmployee(scan.next(), scan.nextInt(), scan.nextInt());
				System.out.println(salariedEmployee);
			} else if (menu == 2) {
				System.out.println("이름, 사번, 시간당임금, 시간을 입력하세요");
				HourEmployee hourEmployee = new HourEmployee(scan.next(), scan.nextInt(), scan.nextInt(),
						scan.nextInt());
				System.out.println(hourEmployee);
			} else if (menu == 3) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("잘못입력하셨습니다.");
			}
		}
	}
}
