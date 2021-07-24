package week10;

import java.util.Arrays;

public class PersonTest {

	public static void main(String[] args) {
		Person[] persons = { new Person("홍릉", 180.0), new Person("용원", 168.0), new Person("인성", 175.0),
				new Person("성우", 170.0) };
		System.out.println("=== 정렬 전 데이터 ===");
		for (Person temp : persons)
			System.out.println(temp);

		Arrays.sort(persons);
		System.out.println("=== 정렬 후 데이터 ===");
		for (Person temp : persons)
			System.out.println(temp);
	}

}
