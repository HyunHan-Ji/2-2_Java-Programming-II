package week04;

import java.util.*;
public class WordTest {	
	public static void main(String[] args) {
	    
		Word str[] = { new Word("one", "�ϳ�"), new Word("student", "�л�"), new Word("apple", "���"),
					new Word("school", "�б�"), new Word("flower", "��"), new Word("mouse", "��"),
					new Word("science", "����"), new Word("computer", "��ǻ��"), new Word("word", "�ܾ�"),
					new Word("keyboard", "�ǹ�")};
		Scanner in = new Scanner(System.in);
		
		while(true) {
			System.out.print(">>> 1.�ܾ�ã�� 2.���ڷ� �����ϴ� �ܾ� ã��: ");
			int menu = in.nextInt();
			
			if(menu == 1) {
				System.out.print("ã���� �ϴ� �ܾ �Է��ϼ���: ");
				System.out.println(WordProcess.search(str, in.next()));
			}else if(menu == 2) {
				System.out.print("���ڸ� �Է��ϼ���: ");
				char ch = in.next().charAt(0);
				System.out.println(ch + "�� �����ϴ� �ܾ ����մϴ�");
				WordProcess.search(str, ch);
			}
	
			
			System.out.print("ã�� �۾��� �ߴ��Ϸ��� F�Ǵ� f�� �Է��ϼ��� >> ");
			char bk = in.next().charAt(0);
			if(bk =='f' || bk == 'F')
				break;
		}
	}
}
