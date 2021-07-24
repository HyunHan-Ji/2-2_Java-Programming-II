package week12;

class Account {
	int balance; // 잔액

	@Override
	public String toString() {
		return "Account [balance=" + balance + "]";
	}

	int withdraw(int amount) throws Exception {
		if (balance < amount)
			// 현재 메소드에서 발생하는 예외 종류를 표시하는 throws 절
			throw new Exception("잔액이 부족합니다.");
		balance -= amount;
		return amount;
	}

	int deposit(int amount) throws Exception {
		if (amount < 0)
			throw new Exception("입금액이 음수 입니다.");
		balance += amount;
		return amount;
	}
}

public class ExceptionExample {
	public static void error(String str) {
		System.out.println(str + "예외를 정상 처리 하였습니다 ");
	}

	public static void main(String args[]) {
		Account obj = new Account();
		try {
			int amount = obj.withdraw(100000000); // 예외 발생 메소드
			System.out.println("인출액:" + amount);
		} catch (Exception e) { // 발생된 예외 처리
			String msg = e.getMessage(); // 오류 메시지 출력
			System.out.println(msg);
			error("인출 ");
		}
		System.out.println(obj);
		try {
			int amount = obj.deposit(-100); // 예외 발생 메소드
			System.out.println("입금액:" + amount);
		} catch (Exception e) { // 발생된 예외 처리
			String msg = e.getMessage(); // 오류 메시지 출력
			System.out.println(msg);
			error("입금");
		}
		System.out.println(obj);
	}
}
