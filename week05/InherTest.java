package week05;

import java.util.*;

public class InherTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Cal obj = null;
		int i = 1;
		while (true) {
			System.out.print("\n1: Add, 2: Mod  3: ����-> �޴��Է�( " + (i++) + " ��°) : ");
			int menu = in.nextInt();
			if (menu == 3)
				break;
			switch (menu) {
			case 1:
				System.out.println("\n=== Add ===");
				System.out.print("���۷��� a, b�� �Է��ϼ��� => ");
				obj = new Add(in.nextInt(), in.nextInt(), '+'); // ��ü �迭 �ʱ�ȭ
				break;
			case 2:
				System.out.println("\n=== Mod ===");
				System.out.print("���۷��� a, b�� �Է��ϼ��� => ");
				obj = new Mod(in.nextInt(), in.nextInt(), '%'); // ��ü �迭 �ʱ�ȭ
				break;
			}
			System.out.println(obj);
		}
		System.out.println("���α׷��� �����մϴ�");
	}
}
