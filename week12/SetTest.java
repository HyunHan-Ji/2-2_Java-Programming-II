package week12;

import java.util.*;

class Student2 implements Comparable<Student2> {
	int number;
	String name;

	public Student2(int number, String name) {
		this.number = number;
		this.name = name;
	}

	public String toString() {
		return "�й� : " + number + "\t�̸� : " + name + "\n";
	}

	public int compareTo(Student2 s) { // ������
		return this.number - s.number;
	}
}

public class SetTest {
	public static void main(String args[]) {
		Student2 array[] = { new Student2(2009002, "��ö��"), new Student2(2009001, "��ö��"), new Student2(2009003, "��ö��") };
		List<Student2> list = Arrays.asList(array); // �迭�� ����Ʈ�� ��ȯ
		Collections.sort(list); // ũ������� ����
		System.out.println(list);
	}
}
