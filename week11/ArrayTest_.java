package week11;

import java.util.*;

public class ArrayTest_ {
	public static void main(String[] args) {
		ArrayList<Person> alist = new ArrayList<>();
		ListExam.add(alist, new Person("����", 179));
		ListExam.add(alist, new Person("�µ�", 173));
		ListExam.add(alist, new Person("�α�", 183));
		ListExam.add(alist, new Person("���", 180));
		ListExam.write(alist);
	}
}
