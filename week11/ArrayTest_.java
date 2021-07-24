package week11;

import java.util.*;

public class ArrayTest_ {
	public static void main(String[] args) {
		ArrayList<Person> alist = new ArrayList<>();
		ListExam.add(alist, new Person("성우", 179));
		ListExam.add(alist, new Person("태동", 173));
		ListExam.add(alist, new Person("인국", 183));
		ListExam.add(alist, new Person("용권", 180));
		ListExam.write(alist);
	}
}
