package week04;

import java.util.*;

public class BoxTest {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Box[] obj=new Box[5];
		
		for(int i=0; i<obj.length;i++) {
			System.out.println((i+1)+ "번  : 가로, 세로, 높이를 입력하세요 : ");
			obj[i]=new Box(in.nextInt(), in.nextInt(),in.nextInt());
		}
		System.out.println("객체 내용 출력===");
		for(Box temp : obj)
			System.out.println(temp);
		
		System.out.println("\n부피가 큰 박스 => \n" + BoxMax.isMax(obj));
		

		if(obj[0].isSame(obj[1]))
					System.out.println("동일한 객체 입니다");
				else
					System.out.println("서로 다른 객체 입니다");
	}
}

