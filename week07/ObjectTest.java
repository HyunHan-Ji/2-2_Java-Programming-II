package week07;

public class ObjectTest {

	public static void main(String[] args) {
		Person[] array = { new Person("����", 178.0), new Person("�浿", 185.0), new Person("ȫ��", 180.0),new Person("ö��",190),new Person("����",183) };
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("\nŰ�� ���� ū���: " + getMaximum(array));
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
