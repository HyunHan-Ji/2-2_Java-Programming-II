package week11;

import java.util.*;

public class Q2main {

	public static void main(String[] args) {
		String[] s = { "���", "��", "�ٳ���" };
		ArrayList list = new ArrayList(Arrays.asList(s));

		list.add("����");
		list.add(2, "�ڸ�");
		System.out.println("------- ����Ʈ ��� ------------");
		for(Object obj:list)
			System.out.println(obj);
		System.out.println("----------------------------");
		System.out.println("�ε��� 3: " + list.get(3));
		list.set(2, "�޷�");
		list.add("��");
		System.out.println("�谡 ����� ��ġ: " + list.indexOf("��"));
		list.remove("�ٳ���");
		System.out.println("------- ����Ʈ ��� ------------");
		for(Object obj:list)
			System.out.println(obj);
		System.out.println("----------------------------");
	}
}
