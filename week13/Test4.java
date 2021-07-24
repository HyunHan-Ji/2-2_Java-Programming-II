package week13;

public class Test4 {
	private int count = 1;

	public synchronized void sub() {
		for (int i = 0; i < 10; i++)
			System.out.println(count++);
	}

	public static void main(String[] args) {
		Test4 demo = new Test4();
		Thread a1 = new A(demo);
		Thread a2 = new A(demo);
		a1.start();
		a2.start();
	}
}

class A extends Thread {
	Test4 demo;
	public A(Test4 td) {
		demo = td;
	}
	public void run() {
		demo.sub();
	}
}
