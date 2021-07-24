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
		return "학번 : " + number + "\t이름 : " + name + "\n";
	}

	public int compareTo(Student2 s) { // 재정의
		return this.number - s.number;
	}
}

public class SetTest {
	public static void main(String args[]) {
		Student2 array[] = { new Student2(2009002, "김철수"), new Student2(2009001, "이철수"), new Student2(2009003, "박철수") };
		List<Student2> list = Arrays.asList(array); // 배열을 리스트로 변환
		Collections.sort(list); // 크기순으로 정렬
		System.out.println(list);
	}
}
