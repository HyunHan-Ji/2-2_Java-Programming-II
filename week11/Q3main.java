package week11;

import java.util.*;

public class Q3main {

	public static void main(String[] args) {
		int[] d1 = { 4, 2, 3, 7, 6, 12 };
		int[] d2 = { 4, 6, 12, 3, 5, 9 };

		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		for (int temp : d1)
			set1.add(temp);
		for (int temp : d2)
			set2.add(temp);
		
		print(set1);
		print(set2);

		Set<Integer> union = new HashSet<>(set1);
		//union.addAll(set2);
		for(int temp:set2)
			union.add(temp);
		
		Set<Integer> Intersection = new HashSet<>();
		Set<Integer> Intersection2 = new HashSet<>(set1);
		//Intersection2.retainAll(set2);
		for(int temp:set2) {
			if(!Intersection2.add(temp)) {
				Intersection.add(temp);
			}
	}		
		
		System.out.println("합집합: " + union);
		System.out.println("교집합: " + Intersection);
	}

	public static void print(Set<Integer> set) {
		System.out.println(">> 배열 원소 출력");
		for (int temp : set)
			System.out.print(temp + " ");
		System.out.println();
	}
}
