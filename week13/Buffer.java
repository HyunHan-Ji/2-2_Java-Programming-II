package week13;

class Buffer {
	private String data; // 생산자로부터 소비자로 전해지는 데이터
	private boolean empty = true; // 소비자가 기다리면 true, 생산자가 기다리면 false

	public synchronized String get() {
		while (empty) {
			try {
				wait(); // 리턴 한 후 반드시 조건을 다시 검사 해야 함
			} catch (InterruptedException e) {
			}
		}
		empty = true; // 상태를 토글한다
		notifyAll(); // 생산자를 깨운다
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