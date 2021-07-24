package week14;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Q2main {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 파일 이름을 입력하시오: ");
		String FileName1 = scan.next();
		System.out.print("두번째 파일 이름을 입력하시오: ");
		String FileName2 = scan.next();

		boolean result = true;
		try (InputStream inStream1 = new FileInputStream(FileName1);
				InputStream inStream2 = new FileInputStream(FileName2)) {
			int a, b;
			while (((a = inStream1.read()) != -1) && ((b = inStream2.read()) != -1)) {
				System.out.println((char) a + ":" + (char) b);
				if (a != b) {
					result = false;
					break;
				}
			}
			if (result) {
				System.out.println("내용이 동일한 파일 입니다.");
			} else {
				System.out.println("내용이 서로 다른 파일 입니다.");
			}
		}
	}
}
