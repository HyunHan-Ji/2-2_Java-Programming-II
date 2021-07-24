package week14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q4main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader("result.txt")); // ���� ��Ʈ���� ����
			String line;
			int i = 1;
			while ((line = in.readLine()) != null) { // ���δ����� �о��
				System.out.println(i + ") " + line);
				i++;
			}
		} finally {
			if (in != null)
				in.close();
		}
	}
}
