package week11;

import java.util.Scanner;

public class CustomerTest {

	public static void main(String[] args) {
		// 메뉴처리
		Scanner scan = new Scanner(System.in);
		CustomerManage cm = new CustomerManage();
		while (true) {
			System.out.print("1:회원가입  2:회원탈퇴  3:모든 회원 정보 출력  4:종료 ----> ");
			int menu = scan.nextInt();
			if (menu == 1) {
				System.out.print("이름을 입력하세요: ");
				String name = scan.next();
				System.out.print("아이디를 입력하세요: ");
				String cnum = scan.next();
				cm.add(new Customer(name, cnum));
			} else if (menu == 2) {
				System.out.print("아이디를 입력하세요: ");
				cm.delete(scan.next());
			} else if (menu == 3) {
				cm.print();
			} else if (menu == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("입력 오류");
			}
		}
	}
}
