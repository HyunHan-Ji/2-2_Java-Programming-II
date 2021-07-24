package week13;

public class Test {
	public static void main(String[] args) {
		try {
			sub();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void sub() throws Exception {
		int[] array = new int[10];
		int n = 10;
		if (n >= array.length) {
			throw new Exception("인덱스 오류");
		}
		int i = array[n];
	}
}
