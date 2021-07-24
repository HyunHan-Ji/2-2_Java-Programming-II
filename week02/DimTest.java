package week02;

import java.util.*;

public class DimTest {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Dim dim = new Dim();
		
		System.out.print("정수형 배열 크기를 입력하세요: ");
		dim.init(scan.nextInt(), 'i');
		System.out.println(">> 초기화된 정수형 배열을 출력 합니다");
		dim.aprint('i');
		System.out.println();
		
		
		System.out.print("실수형 배열 크기를 입력하세요: ");
		dim.init(scan.nextInt(),'d');
		System.out.println(">> 초기화된 실수형 배열을 출력 합니다");
		dim.aprint('d');
		System.out.println();
		
		
		System.out.print("몇 번째 데이터를 출력하시겠습니까? >> ");
		int num=scan.nextInt();
		System.out.print("정수배열이면 'd', 실수배열이면 'f'를 입력 하세요 >> ");
		char type = scan.next().charAt(0);
		
		if(type == 'd') {
			System.out.println(dim.isearch(num-1));
		}else if(type == 'f'){
			System.out.println(dim.dsearch(num-1));
		}
	}

}
