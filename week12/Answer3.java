package week12;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

class Person {
	private String name; // 이름
	private String num; // 전화번호

	public Person(String name, String num) {
		this.name = name;
		this.num = num;
	}

	public String toString() {
		return " [이름 : " + name + ",  전화번호 : " + num + "]";
	}
}

public class Answer3 {
	public static void main(String[] args) {
		HashMap<String, Person> map = new HashMap();
		Scanner scan = new Scanner(System.in);

		map.put("qwer", new Person("홍길동", "010-1111-2222"));
		map.put("asdf", new Person("김길동", "010-3333-4444"));
		map.put("zxcv", new Person("이길동", "010-5555-6666"));

		while (true) {
			System.out.print("1.id로 데이터 출력    2.전체출력   3.종료  -->");
			int menu = scan.nextInt();
			if (menu == 1) {
				System.out.print("id입력: ");
				System.out.println(map.get(scan.next()));
			} else if (menu == 2) {
				System.out.println("전체출력");
				for (Entry<String, Person> s : map.entrySet()) {
					String key = s.getKey();
					Person value = s.getValue();
					System.out.println("id = " + key + ", 데이터 =" + value);
				}
			} else if (menu == 3) {
				break;
			} else {
				System.out.println("입력오류");
			}
		}
	}
}
