package week04;

public class MemberServiceTest {

	public static void main(String[] args) {
		MemberService sv=new MemberService();
		
		if(sv.login("hong",12345)) {
			System.out.println("�α��� �Ǿ����ϴ�.");
		}
		
		sv.logout("hong");
	}

}
