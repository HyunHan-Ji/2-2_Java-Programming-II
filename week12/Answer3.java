package week12;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

class Person {
	private String name; // �̸�
	private String num; // ��ȭ��ȣ

	public Person(String name, String num) {
		this.name = name;
		this.num = num;
	}

	public String toString() {
		return " [�̸� : " + name + ",  ��ȭ��ȣ : " + num + "]";
	}
}

public class Answer3 {
	public static void main(String[] args) {
		HashMap<String, Person> map = new HashMap();
		Scanner scan = new Scanner(System.in);

		map.put("qwer", new Person("ȫ�浿", "010-1111-2222"));
		map.put("asdf", new Person("��浿", "010-3333-4444"));
		map.put("zxcv", new Person("�̱浿", "010-5555-6666"));

		while (true) {
			System.out.print("1.id�� ������ ���    2.��ü���   3.����  -->");
			int menu = scan.nextInt();
			if (menu == 1) {
				System.out.print("id�Է�: ");
				System.out.println(map.get(scan.next()));
			} else if (menu == 2) {
				System.out.println("��ü���");
				for (Entry<String, Person> s : map.entrySet()) {
					String key = s.getKey();
					Person value = s.getValue();
					System.out.println("id = " + key + ", ������ =" + value);
				}
			} else if (menu == 3) {
				break;
			} else {
				System.out.println("�Է¿���");
			}
		}
	}
}
