package week13;

class Test2 implements Runnable {
	public static void main(String args[]) {
		/* 비어있는 부분 */
		Thread t = new Thread(new Test2());
		t.start();
	}

	public void run() {
		System.out.println("asdf");
	}
}
