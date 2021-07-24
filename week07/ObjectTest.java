package week07;

public class ObjectTest {

	public static void main(String[] args) {
		Person[] array = { new Person("경주", 178.0), new Person("길동", 185.0), new Person("홍길", 180.0),new Person("철수",190),new Person("무개",183) };
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("\n키가 가장 큰사람: " + getMaximum(array));
	}

	public static Person getMaximum(Person[] array) {
		Person max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i].compareTo(max) == 1) {
				max = array[i];
			}
		}
		return max;
	}
}
