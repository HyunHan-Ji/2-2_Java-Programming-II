package week04;

import java.util.*;

public class BoxTest {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Box[] obj=new Box[5];
		
		for(int i=0; i<obj.length;i++) {
			System.out.println((i+1)+ "��  : ����, ����, ���̸� �Է��ϼ��� : ");
			obj[i]=new Box(in.nextInt(), in.nextInt(),in.nextInt());
		}
		System.out.println("��ü ���� ���===");
		for(Box temp : obj)
			System.out.println(temp);
		
		System.out.println("\n���ǰ� ū �ڽ� => \n" + BoxMax.isMax(obj));
		

		if(obj[0].isSame(obj[1]))
					System.out.println("������ ��ü �Դϴ�");
				else
					System.out.println("���� �ٸ� ��ü �Դϴ�");
	}
}

