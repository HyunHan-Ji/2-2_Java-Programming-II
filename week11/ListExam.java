package week11;

import java.util.*;

public class ListExam {

	public static void add(ArrayList<Person> alist, Person person) {
		int asize = alist.size(); // alist.size�� ��� �ٲ�Ƿ� ������ �����ؼ� ���
		if (asize == 0) { // list�� ó������
			alist.add(person);
		} else {
			for (int i = 0; i < asize; i++) {
				if (person.getHeight() < alist.get(i).getHeight()) { // �� �ڸ��� ������ ������ �� �ڸ��� ����
					alist.add(i, person);
				} else if (i == (asize - 1)) { // ������ִ� ���麸�� Ŭ��
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
