package week13;

class Test2 implements Runnable {
	public static void main(String args[]) {
		/* ����ִ� �κ� */
		Thread t = new Thread(new Test2());
		t.start();
	}

	public void run() {
		System.out.println("asdf");
	}
}
