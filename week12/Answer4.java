package week12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Answer4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<studentGrade> list = new ArrayList<studentGrade>();

		while (true) {
			System.out.println("�ߴ��Ϸ��� ������ �Է��ϼ���");
			System.out.print("�л���ȣ: ");
			int num = scan.nextInt();
			if (num < 0)
				break;
			System.out.print("��������: ");
			int kor = scan.nextInt();
			System.out.print("��������: ");
			int eng = scan.nextInt();
			System.out.print("��������: ");
			int math = scan.nextInt();

			list.add(new studentGrade(num, kor, eng, math));
		}

		Collections.sort(list);

		System.out.printf("\t��ȣ\t����\t����\t����\t����\t���\n");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.printf("\t���� �հ�: %d\t%d\t%d\n", studentGrade.getSumKor(), studentGrade.getSumEng(),
				studentGrade.getSumMath());
		System.out.printf("\t���� ���: %d\t%d\t%d\n", studentGrade.getSumKor() / list.size(),
				studentGrade.getSumEng() / list.size(), studentGrade.getSumMath() / list.size());
	}
}

class studentGrade implements Comparable<studentGrade> {
	private int num;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private int avg;
	private static int sumKor = 0;
	private static int sumEng = 0;
	private static int sumMath = 0;

	public studentGrade(int num, int kor, int eng, int math) {
		this.num = num;
		sumKor += this.kor = kor;
		sumEng += this.eng = eng;
		sumMath += this.math = math;
		sum = kor + eng + math;
		avg = sum / 3;
	}

	@Override
	public String toString() {
		return "\t" + num + "\t" + kor + "\t" + eng + "\t" + math + "\t" + sum + "\t" + avg;
	}

	@Override
	public int compareTo(studentGrade o) {
		return Integer.compare(this.num, o.num);
	}

	public static int getSumKor() {
		return sumKor;
	}

	public static int getSumEng() {
		return sumEng;
	}

	public static int getSumMath() {
		return sumMath;
	}

}
