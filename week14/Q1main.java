package week14;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q1main {
	public static void main(String[] args) throws IOException {
		Scanner key = new Scanner(System.in);
		FileWriter output = null;
		FileReader input = null;
		try {

			input = new FileReader("output.txt");
			output = new FileWriter("copy.txt");
			int data;
			while ((data = input.read()) != -1)
				output.write((char) data);
			output.close();
			System.out.println("파일 복사 완료");

			System.out.println("===== output.txt 파일 내용 =========");
			input = new FileReader("output.txt");
			while ((data = input.read()) != -1)
				System.out.print((char) data + " ");

			System.out.println("\n====== copy.txt 파일 내용 =========");
			input = new FileReader("copy.txt");
			while ((data = input.read()) != -1)
				System.out.print((char) data + " ");

		} finally {
			if (output != null)
				output.close();
			if (input != null)
				input.close();
		}
	}
}
