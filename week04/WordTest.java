package week04;

import java.util.*;
public class WordTest {	
	public static void main(String[] args) {
	    
		Word str[] = { new Word("one", "하나"), new Word("student", "학생"), new Word("apple", "사과"),
					new Word("school", "학교"), new Word("flower", "꽃"), new Word("mouse", "쥐"),
					new Word("science", "과학"), new Word("computer", "컴퓨터"), new Word("word", "단어"),
					new Word("keyboard", "건반")};
		Scanner in = new Scanner(System.in);
		
		while(true) {
			System.out.print(">>> 1.단어찾기 2.문자로 시작하는 단어 찾기: ");
			int menu = in.nextInt();
			
			if(menu == 1) {
				System.out.print("찾고자 하는 단어를 입력하세요: ");
				System.out.println(WordProcess.search(str, in.next()));
			}else if(menu == 2) {
				System.out.print("문자를 입력하세요: ");
				char ch = in.next().charAt(0);
				System.out.println(ch + "로 시작하는 단어를 출력합니다");
				WordProcess.search(str, ch);
			}
	
			
			System.out.print("찾는 작업을 중단하려면 F또는 f를 입력하세요 >> ");
			char bk = in.next().charAt(0);
			if(bk =='f' || bk == 'F')
				break;
		}
	}
}
