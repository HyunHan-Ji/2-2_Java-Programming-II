package week04;

public class MemberService {
	public boolean login(String id, int password) {
		if(id.equals("hong") && password == 12345) {
			return true;
		}else {
			return false;
		}
	}
	
	void logout(String id) {
		System.out.println(id + ": �α� �ƿ� �Ǿ����ϴ�.");
	}
}
