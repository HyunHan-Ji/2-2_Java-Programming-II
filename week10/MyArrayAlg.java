package week10;

class MyArrayAlg<T> {
	public static <T> void swap(T[] a, int i, int j) {
		T tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
	public static <T>void write(T[] arr) {
		System.out.println("=== �迭 ���Ҹ� ����մϴ� ===");
		for(T temp:arr)
			System.out.print(temp+" ");
		System.out.println();
	}
}
