package week10;

class MyArrayAlg<T> {
	public static <T> void swap(T[] a, int i, int j) {
		T tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
	public static <T>void write(T[] arr) {
		System.out.println("=== 배열 원소를 출력합니다 ===");
		for(T temp:arr)
			System.out.print(temp+" ");
		System.out.println();
	}
}
