package week13;

class recive implements Runnable {
	private Buffer buffer;

	public recive(Buffer buffer) {
		this.buffer = buffer;
	}

	public void run() {
		for (int i = 0; i < 4; i++) {
			String data = buffer.get();
			System.out.printf("������: %d ��° %s �޽����� �����Ͽ����ϴ�.\n", i + 1, data);
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
		(new Thread(new send(buffer))).start(); // ������ ������ ����
		(new Thread(new recive(buffer))).start(); // �Һ��� ������ ����

	}

}
