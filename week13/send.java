package week13;

public class send implements Runnable {
	private Buffer buffer;
	String[] str = { "thread", "singnal send", "network", "synchronizaion" };

	public send(Buffer buffer) {
		this.buffer = buffer;
	}

	public void run() {
		for (int i = 0; i < str.length; i++) {
			buffer.put(str[i]);
			System.out.printf("송신자: %d 번째 메시지를 송신하였습니다.\n", i + 1);
			try {
				Thread.sleep((int) (Math.random() * 100));
			} catch (InterruptedException e) {
			}
		}

	}
}
