package week13;

class Buffer {
	private String data; // �����ڷκ��� �Һ��ڷ� �������� ������
	private boolean empty = true; // �Һ��ڰ� ��ٸ��� true, �����ڰ� ��ٸ��� false

	public synchronized String get() {
		while (empty) {
			try {
				wait(); // ���� �� �� �ݵ�� ������ �ٽ� �˻� �ؾ� ��
			} catch (InterruptedException e) {
			}
		}
		empty = true; // ���¸� ����Ѵ�
		notifyAll(); // �����ڸ� �����
		return data;
	}

	public synchronized void put(String data) {
		while (!empty) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		empty = false;
		this.data = data;
		notifyAll();
	}
}