package week05;

import java.util.*;

public class InherTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Cal obj = null;
		int i = 1;
		while (true) {
			System.out.print("\n1: Add, 2: Mod  3: 종료-> 메뉴입력( " + (i++) + " 번째) : ");
			int menu = in.nextInt();
			if (menu == 3)
				break;
			switch (menu) {
			case 1:
				System.out.println("\n=== Add ===");
				System.out.print("오퍼랜드 a, b를 입력하세요 => ");
				obj = new Add(in.nextInt(), in.nextInt(), '+'); // 객체 배열 초기화
				break;
			case 2:
				System.out.println("\n=== Mod ===");
				System.out.print("오퍼랜드 a, b를 입력하세요 => ");
				obj = new Mod(in.nextInt(), in.nextInt(), '%'); // 객체 배열 초기화
				break;
			}
			System.out.println(obj);
		}
		System.out.println("프로그램을 종료합니다");
	}
}
