package week11;

import java.util.*;

public class CustomerManage {
	LinkedList<Customer> customers = new LinkedList<>();

	// ��ũ�� ����Ʈ�� Customer ��ü�� �����ϴ� �ν��Ͻ� �޼ҵ�, ����Ʈ�� ������ ��ü�� �Ű������� ������ ��ȯ�� ����
	public void add(Customer c) {
		customers.add(c);
	}

	// ��ũ�� ����Ʈ�� ����� ��ü�� ����ϴ� �ν��Ͻ� �޼ҵ�, ��ȯ�� ����
	public void print() {
		System.out.println("----- ȸ�������� ����մϴ�. -----");
		for (Customer temp : customers)
			System.out.println(temp);
	}

	// �Ű������� ���� ���̵� �˻��Ͽ� ã���� true, ã�� ���ϸ� false�� ��ȯ�ϴ� �ν��Ͻ� �޼ҵ�
	public boolean search(String id) {
		for (Customer temp : customers)
			if (temp.getCnum().equals(id))
				return true;
		return false;
	}

	//ȸ�� ���� �޼ҵ�
	public void delete(String id) {
		if (!search(id)) {
			System.out.println("�ش� ���̵� �����ϴ�.");
			return;
		}

		for (Customer temp : customers)
			if (temp.getCnum().equals(id))
				customers.remove(temp);

		System.out.println("���� �Ǿ����ϴ�.");
		print();
	}
}
