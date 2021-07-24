package week13;

class Job extends Thread {
	String name;

	Job(String name) {
		this.name = name;
	}

	public void run() {
		System.out.println(name);
	}
}

public class Test5 {
	public static void main(String[] args) {
		Thread t = new Thread(new Job("t"));
		Thread h = new Thread(new Job("h"));
		t.start();
		h.start();
	}
}
