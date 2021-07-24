package week10;

import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class Manage {
	public void splitString(String[] str1, String str2) {
		String[] str2s = str2.split("-");

		System.out.println(str1[0] + ": " + str2s[0]);
		System.out.println(str1[1] + ": " + str2s[1]);
		System.out.println(str1[2] + ": " + str2s[2] + " " + str2s[3]);
	}

	public void dateWrite() {
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int date = now.get(Calendar.DATE);

		System.out.println(year + "년 " + month + "월 " + date + "일");
	}

	public void startChar() {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();

		int a = random.nextInt(26);

		System.out.print((char) (a + 65) + "로 시작하는 단어 >> ");
		scan.next();

		int b = random.nextInt(26);
		System.out.print((char) (b + 65) + "로 시작하는 단어 >> ");
		scan.next();

		int c = random.nextInt(26);
		System.out.print((char) (c + 65) + "로 시작하는 단어 >> ");
		scan.next();
	}

	public int calChar(String str) {
		String[] strs = str.split(" ");
		int result = Integer.parseInt(strs[0]);

		for (int i = 1; i < strs.length; i += 2) {
			char ch = strs[i].charAt(0);
			int num = Integer.parseInt(strs[i + 1]);
			if (ch == '+') {
				result += num;
			} else if (ch == '-') {
				result -= num;
			} else if (ch == '*') {
				result *= num;
			} else if (ch == '/') {
				result /= num;
			}
		}
		return result;
	}
}
