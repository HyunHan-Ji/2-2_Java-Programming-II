package week10;

import java.util.Arrays;

public class PersonTest {

	public static void main(String[] args) {
		Person[] persons = { new Person("ȫ��", 180.0), new Person("���", 168.0), new Person("�μ�", 175.0),
				new Person("����", 170.0) };
		System.out.println("=== ���� �� ������ ===");
		for (Person temp : persons)
			System.out.println(temp);

		Arrays.sort(persons);
		System.out.println("=== ���� �� ������ ===");
		for (Person temp : persons)
			System.out.println(temp);
	}

}
