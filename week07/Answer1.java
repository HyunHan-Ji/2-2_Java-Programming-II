package week07;

public class Answer1 {

	private static void printSound(Soundable sd) {
		System.out.println(sd.sound());
	}
	public static void main(String[] args) {
		System.out.println("�Ҹ��� ����մϴ�");
		printSound(new Cat());
		printSound(new Dog());
	}

}
