package week13;

public class TestThread_ {
	public static void main(String[] args) {
		Thread th1 = new Thread(()-> {
			char[] ch = { '¡ß', '¢Ã', '¡Ø', '¡Û', '¢¼' };
			for (char temp : ch)
				System.out.println("lamda : " + temp);
		});
		Thread th2 = new Thread(new Thread(()->{
			char ch = 'b';
			while (ch + 2 <= 't') {
				System.out.println("lamda : " + (ch += 2));
			}
		}
		));
		th1.start();
		th2.start();
	}

}
/*
class Thread1 implements Runnable {
	char[] ch = { '¡ß', '¢Ã', '¡Ø', '¡Û', '¢¼' };

	public void run() {
		for (char temp : ch)
			System.out.println("lamda : " + temp);
	}
}

class Thread2 implements Runnable {
	public void run() {
		char ch = 'b';
		while (ch + 2 <= 't') {
			System.out.println("lamda : " + (ch += 2));
		}
	}
}
*/