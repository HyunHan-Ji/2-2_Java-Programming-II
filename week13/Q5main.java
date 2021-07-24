package week13;

public class Q5main {
	public static void main(String[] args) {
		Q5Buffer buffer = new Q5Buffer();
		(new Thread(new ch(buffer))).start();
		(new Thread(new number(buffer))).start();

	}
}

class Q5Buffer {
	private boolean empty = true;

	public synchronized void get() {
		while (empty) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		empty = true;
		notifyAll();
	}

	public synchronized void put() {
		while (!empty) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		empty = false;
		notifyAll();
	}
}

class ch implements Runnable {
	private Q5Buffer buffer;
	String str = "б▐ бр";

	public ch(Q5Buffer buffer) {
		this.buffer = buffer;
	}

	public void run() {
		String print = "";
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < Math.random() * 10; j++) {
				print += str;
			}
			System.out.print(print);
			buffer.put();

			try {
				Thread.sleep((int) (Math.random() * 100));
			} catch (InterruptedException e) {
			}
		}
	}
}

class number implements Runnable {
	private Q5Buffer buffer;
	String num = String.valueOf((int) (Math.random() * 10));

	public number(Q5Buffer buffer) {
		this.buffer = buffer;
	}

	public void run() {
		String print = "";
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < Math.random() * 10; j++) {
				print += num;
			}
			System.out.print(print);
			buffer.get();

			try {
				Thread.sleep((int) (Math.random() * 100));
			} catch (InterruptedException e) {
			}
		}
	}
}