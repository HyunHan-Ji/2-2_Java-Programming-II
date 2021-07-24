package week14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q4main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader("result.txt")); // 버퍼 스트림과 연결
			String line;
			int i = 1;
			while ((line = in.readLine()) != null) { // 라인단위로 읽어옴
				System.out.println(i + ") " + line);
				i++;
			}
		} finally {
			if (in != null)
				in.close();
		}
	}
}
