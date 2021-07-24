package week09;

import java.util.Scanner;

public class main5 {

	public static void main(String[] args) {
		String[] hexa2bin = { "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010",
				"1011", "1100", "1101", "1110", "1111" };
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("16진수를 입력하세요");
			System.out.print("반복문을 종료하려면 s또는 S를 입력하세요: ");
			String str = scan.next();
			if (str.charAt(0) == 's' || str.charAt(0) == 'S') {
				System.out.println("프로그램 종료");
				break;
			}

			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
					System.out.print(hexa2bin[(int) str.charAt(i) - 48] + " ");
				} else if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'f')) {
					System.out.print(hexa2bin[(int) str.charAt(i) - 87] + " ");
				} else if ((str.charAt(i) >= 'A' && str.charAt(i) <= 'F')) {
					System.out.print(hexa2bin[(int) str.charAt(i) - 55] + " ");
				} else {
					System.out.print("---- ");
				}
			}
			System.out.println();
		}
	}
}
