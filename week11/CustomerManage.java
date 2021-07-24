package week11;

import java.util.*;

public class CustomerManage {
	LinkedList<Customer> customers = new LinkedList<>();

	// 링크드 리스트에 Customer 객체를 저장하는 인스턴스 메소드, 리스트에 저장할 객체를 매개변수로 받으며 반환값 없음
	public void add(Customer c) {
		customers.add(c);
	}

	// 링크드 리스트에 저장된 객체를 출력하는 인스턴스 메소드, 반환값 없음
	public void print() {
		System.out.println("----- 회원정보를 출력합니다. -----");
		for (Customer temp : customers)
			System.out.println(temp);
	}

	// 매개변수로 받은 아이디를 검색하여 찾으면 true, 찾지 못하면 false를 반환하는 인스턴스 메소드
	public boolean search(String id) {
		for (Customer temp : customers)
			if (temp.getCnum().equals(id))
				return true;
		return false;
	}

	//회원 삭제 메소드
	public void delete(String id) {
		if (!search(id)) {
			System.out.println("해당 아이디가 없습니다.");
			return;
		}

		for (Customer temp : customers)
			if (temp.getCnum().equals(id))
				customers.remove(temp);

		System.out.println("삭제 되었습니다.");
		print();
	}
}
