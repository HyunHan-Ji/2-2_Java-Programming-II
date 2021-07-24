package week11;

import java.util.*;

public class Q1main {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		Random rnd = new Random();

		while (set.size() < 10) {
			set.add(rnd.nextInt(89) + 10);
		}

		System.out.println(set);
	}
}
