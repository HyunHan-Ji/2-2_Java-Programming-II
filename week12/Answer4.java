package week12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Answer4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<studentGrade> list = new ArrayList<studentGrade>();

		while (true) {
			System.out.println("중단하려면 음수를 입력하세요");
			System.out.print("학생번호: ");
			int num = scan.nextInt();
			if (num < 0)
				break;
			System.out.print("국어점수: ");
			int kor = scan.nextInt();
			System.out.print("영어점수: ");
			int eng = scan.nextInt();
			System.out.print("수학점수: ");
			int math = scan.nextInt();

			list.add(new studentGrade(num, kor, eng, math));
		}

		Collections.sort(list);

		System.out.printf("\t번호\t국어\t영어\t수학\t총점\t평균\n");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.printf("\t과목 합계: %d\t%d\t%d\n", studentGrade.getSumKor(), studentGrade.getSumEng(),
				studentGrade.getSumMath());
		System.out.printf("\t과목 평균: %d\t%d\t%d\n", studentGrade.getSumKor() / list.size(),
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
