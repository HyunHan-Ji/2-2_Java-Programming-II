package week05_;

import java.util.*;

public class Answer8 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		Person p[] = new Person[5];

		for (int i = 0; i < p.length; i++) {
			System.out.println("1:Customer 객체, 2:Student 객체");
			int menu = key.nextInt();
			String name = input("이름을 입력하세요: ", key);
			int age = digit("나이를 입력하세요: ", key);

			if (menu == 1) {
				char gubun = input("고객구분을 입력하세요: ", key).charAt(0);
				int point = digit("포인트를 입력하세요: ", key);
				p[i] = new Customer(name, age, gubun, point);
			} else if (menu == 2) {
				String num = input("학번을 입력하세요: ", key);
				int grade = digit("점수를 입력하세요: ", key);
				p[i] = new Student(name, age, num, grade);
			}
		}

		System.out.println("\n==== 객체 내용 출력 ====");
		for (Person temp : p) {
			temp.diPlay();
			if (temp instanceof Customer) {
				((Customer) temp).addPoint(500);
			}
		}
		System.out.println("\n==== Customer 객체만 출력 ====");
		for (Person temp : p) {
			if (temp instanceof Customer) {
				temp.diPlay();
			}
		}
	}

	static String input(String str, Scanner key) {
		System.out.print(str);
		return key.next();
	}

	static int digit(String str, Scanner key) {
		System.out.print(str);
		return key.nextInt();
	}
}
