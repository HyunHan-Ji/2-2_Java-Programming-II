package week11;

import java.util.*;

public class ListExam {

	public static void add(ArrayList<Person> alist, Person person) {
		int asize = alist.size(); // alist.size가 계속 바뀌므로 변수에 저장해서 사용
		if (asize == 0) { // list에 처음들어갈때
			alist.add(person);
		} else {
			for (int i = 0; i < asize; i++) {
				if (person.getHeight() < alist.get(i).getHeight()) { // 그 자리의 값보다 작으면 그 자리에 삽입
					alist.add(i, person);
				} else if (i == (asize - 1)) { // 저장되있는 값들보다 클때
					alist.add(person);
				}
			}
		}
	}

	public static void write(ArrayList<Person> alist) {
		for (Person temp : alist)
			System.out.println(temp);
	}
}
