package week14;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q3main {
	public static void main(String[] args) throws IOException {
		Scanner key = new Scanner(System.in);
		FileWriter output = null;
		FileReader input = null;
		String var;
		int data;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		try {
			output = new FileWriter("output.txt");

			while (true) {
				System.out.print("문자열 입력(종료:f 또는 F): ");
				var = key.next();
				if (var.equals("f") || var.equals("F"))
					break;
				output.write(var);
			}
			output.close();

			input = new FileReader("output.txt");
			System.out.println("======파일에 저장된 문자의 빈도수 출력 ====");
			char ch;
			while ((data = input.read()) != -1) {
				ch = (char) data;
				if (map.containsKey(ch)) {
					map.put(ch, map.get(ch) + 1);
				} else {
					map.put(ch, 1);
				}
			}

			for (Map.Entry<Character, Integer> m : map.entrySet()) {
				System.out.printf("key = %c\t\tvalue = %d\n", m.getKey(), m.getValue());
			}
		} finally {
			if (output != null)
				output.close();
			if (input != null)
				input.close();
		}
	}
}