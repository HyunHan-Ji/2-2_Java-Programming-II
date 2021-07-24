package week14;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Q2main {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.print("ù��° ���� �̸��� �Է��Ͻÿ�: ");
		String FileName1 = scan.next();
		System.out.print("�ι�° ���� �̸��� �Է��Ͻÿ�: ");
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
				System.out.println("������ ������ ���� �Դϴ�.");
			} else {
				System.out.println("������ ���� �ٸ� ���� �Դϴ�.");
			}
		}
	}
}
