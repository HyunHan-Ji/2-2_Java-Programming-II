package week13;

class recive implements Runnable {
	private Buffer buffer;

	public recive(Buffer buffer) {
		this.buffer = buffer;
	}

	public void run() {
		for (int i = 0; i < 4; i++) {
			String data = buffer.get();
			System.out.printf("수신자: %d 번째 %s 메시지를 수신하였습니다.\n", i + 1, data);
			try {
				Thread.sleep((int) (Math.random() * 100));
			} catch (InterruptedException e) {
			}
		}

	}
}

public class Q3main {

	public static void main(String[] args) {
		Buffer buffer = new Buffer();
		(new Thread(new send(buffer))).start(); // 생산자 스레드 시작
		(new Thread(new recive(buffer))).start(); // 소비자 스레드 시작

	}

}
