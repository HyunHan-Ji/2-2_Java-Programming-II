package week13;

public class Test3 implements Runnable {
	public static void main(String[] args) {
		Test3 t = new Test3();
		Thread x = new Thread(t);
		x.start();
	}

	public void run() {
		for (int i = 0; i < 3; ++i) {
			System.out.print(i + "..");
		}
	}
}
