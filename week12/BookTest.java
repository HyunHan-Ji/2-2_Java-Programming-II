package week12;

import java.util.*;

public class BookTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Book> list = new ArrayList<Book>();
		/*
		 * list.add(new Book("1234", "Java", "John")); list.add(new Book("2345", "C",
		 * "Annie")); list.add(new Book("5678", "Python", "Tom"));
		 */
		while (true) {
			System.out.print("메뉴: 1.저장  2.대출  3.검색  4.리스트 출력  5.삭제  6.종료  -->");
			int menu = scan.nextInt();
			if (menu == 1) {
				System.out.print("저장 메뉴\n관리번호 제목 저자 입력: ");
				list.add(new Book(scan.next(), scan.next(), scan.next()));
			} else if (menu == 2) {
				System.out.print("대출 메뉴 입니다\n대출하고자 하는 책 제목을 입력: ");
				String str = scan.next();
				for (int i = 0; i < list.size(); i++) {
					if (str.equals(list.get(i).getTitle())) {
						list.get(i).rentBook();
						break;
					}
				}
			} else if (menu == 3) {
				System.out.print("검색 메뉴\n검색하고자 하는 책 제목을 입력: ");
				String str = scan.next();
				System.out.println("관리번호\t제목\t저자\t대출 상태");
				for (int i = 0; i < list.size(); i++) {
					if (str.equals(list.get(i).getTitle())) {
						System.out.println(list.get(i));
						break;
					}
				}
			} else if (menu == 4) {
				System.out.println("전체 출력");
				System.out.println("관리번호\t제목\t저자\t대출 상태");
				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i));
				}
			} else if (menu == 5) {
				System.out.print("삭제 메뉴\n관리번호 입력: ");
				String str = scan.next();
				for (int i = 0; i < list.size(); i++) {
					if (str.equals(list.get(i).getNumber())) {
						list.remove(i);
					}
				}
			} else if (menu == 6) {
				System.out.println("종료합니다.");
				break;
			} else {
				System.out.println("입력오류");
			}
		}
	}

}
