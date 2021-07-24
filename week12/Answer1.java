package week12;

import java.util.*;
import java.util.Map.Entry;

public class Answer1 {
	public static void main(String args[]) {
		Map<Integer, Integer> map;
		map = Count.count(); // 빈도수를 계산한 HashMap을 반환받아 저장
		System.out.println("Map에 저장된 빈도수를 출력합니다");
		Count.write(map); // HashMap에 저장된 원소 출력
	}
}

class Count {
	static HashMap<Integer, Integer> count() {
		Random random = new Random();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 0);
		map.put(2, 0);
		map.put(3, 0);
		map.put(4, 0);
		map.put(5, 0);
		map.put(6, 0);
		for (int i = 0; i < 100; i++) {
			int a = random.nextInt(6)+1;
			map.put(a, map.get(a) + 1);
		}

		return map;
	}
	
	static void write(Map<Integer, Integer> map) {
		
		for (Entry<Integer, Integer> s : map.entrySet()) {
			Integer key = s.getKey();
			Integer value = s.getValue();
			System.out.println("주사위눈 = " + key + ", 빈도수=" + value);
		}
		/*
		map.forEach((key,value) -> {
		 System.out.println("주사위눈 = " + key + ", 빈도수=" + value);
		 )};
		*/
		 
	}
}