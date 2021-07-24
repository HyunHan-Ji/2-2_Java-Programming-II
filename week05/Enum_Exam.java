package week05;

import java.util.Calendar;

enum Week {
	�Ͽ���, ������, ȭ����, ������, �����, �ݿ���, �����
}

public class Enum_Exam {
	public static void main(String[] args) {
		Week[] days = Week.values(); // ���� ��ü�� �迭�� ��ȯ
		Week tomorrow = null; // ������ ���� ����� �ʱ�ȭ
		Calendar cr = Calendar.getInstance();
		int week = cr.get(Calendar.DAY_OF_WEEK); // ��(1) ~��(7)���� ���� ����
		String today = days[week].name(); // ���� ��ü�� ���ڿ� ��ȯ
		System.out.println("������ " + today + " �Դϴ�");
		tomorrow = Week.valueOf(today); // �־��� ���ڿ��� ���� ��ü�� ��ȯ
		if (tomorrow == Week.����� || tomorrow == Week.�Ͽ���)
			System.out.println("�ָ��Դϴ�");
		else
			System.out.println("���� �Դϴ�");
		System.out.println(tomorrow.ordinal()); // ���� ��ü�� ���� ��ȯ
	}
}
