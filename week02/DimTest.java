package week02;

import java.util.*;

public class DimTest {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Dim dim = new Dim();
		
		System.out.print("������ �迭 ũ�⸦ �Է��ϼ���: ");
		dim.init(scan.nextInt(), 'i');
		System.out.println(">> �ʱ�ȭ�� ������ �迭�� ��� �մϴ�");
		dim.aprint('i');
		System.out.println();
		
		
		System.out.print("�Ǽ��� �迭 ũ�⸦ �Է��ϼ���: ");
		dim.init(scan.nextInt(),'d');
		System.out.println(">> �ʱ�ȭ�� �Ǽ��� �迭�� ��� �մϴ�");
		dim.aprint('d');
		System.out.println();
		
		
		System.out.print("�� ��° �����͸� ����Ͻðڽ��ϱ�? >> ");
		int num=scan.nextInt();
		System.out.print("�����迭�̸� 'd', �Ǽ��迭�̸� 'f'�� �Է� �ϼ��� >> ");
		char type = scan.next().charAt(0);
		
		if(type == 'd') {
			System.out.println(dim.isearch(num-1));
		}else if(type == 'f'){
			System.out.println(dim.dsearch(num-1));
		}
	}

}
