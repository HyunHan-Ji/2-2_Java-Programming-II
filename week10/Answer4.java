package week10;

public class Answer4 {
	public static void main(String[] args) {
		Manage manage = new Manage();
		manage.splitString(new String[] { "국가번호", "도시식별번호", "가입자 번호" }, "082-2-777-5566");
		manage.dateWrite();
		manage.startChar();
		System.out.println("34 + 56 - 12 * 2 = " + manage.calChar("34 + 56 - 12 * 2"));
		System.out.println("프로그램 종료");
	}
}
