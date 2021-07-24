package week10;

public class BoxTest {
	public static void main(String[] args) {
		// 다이아 몬드 생성자 호출 시 타입 인수 생략 가능 SE7 버전부터 적용
		Box<String> sg = new Box<>("Generic"); // 문자열을 저장하는 Box 클래스의 객체 생성
		Box<Integer> ig = new Box<Integer>(340); // 정수를 저장하는 Box 클래스의 객체
		System.out.println("<String>" + sg.get());
		System.out.println("<Integer>" + ig.get());
	}
}
