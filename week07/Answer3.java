package week07;

public class Answer3 {
	public static void main(String[] args) {
		Action action = new Action() {

			@Override
			public void work() {
				System.out.println("����Ŭ������ �������̽��� ����");
				System.out.println("���� ��ü�� word()�޼ҵ带 ȣ���մϴ�.");
			}
		};
		action.work();
	}
}
