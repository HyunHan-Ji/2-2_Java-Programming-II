package week07;

public class Answer3 {
	public static void main(String[] args) {
		Action action = new Action() {

			@Override
			public void work() {
				System.out.println("무명클래스로 인터페이스를 구현");
				System.out.println("무명 객체로 word()메소드를 호출합니다.");
			}
		};
		action.work();
	}
}
