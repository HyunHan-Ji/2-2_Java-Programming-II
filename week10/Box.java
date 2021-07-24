package week10;

class Box<T> { // T는 데이터 타입을 의미, < >안에 표기, generic
	private T data; // T 타입을 자료형으로 갖는 data 필드

	public Box(T data) { // T 타입을 형식매개변수로 사용
		this.data = data;
	}

	public void set(T data) {
		this.data = data;
	}

	public T get() {
		return data;
	}
}
