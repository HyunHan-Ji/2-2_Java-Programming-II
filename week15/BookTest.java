package week15;

import java.io.*;
import java.util.*;

public class BookTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ArrayList<Book> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		ObjectOutputStream out = null;
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("object.dat"))) {
			list = (ArrayList<Book>) in.readObject();
			System.out.println("=== 리스트 원소 출력 ===");
			for (int i = 0; i < list.size(); i++) {
				list.get(i).disPlay();
			}
		} catch (EOFException e) { // 파일에 저장된 데이터가 없으면 EOFException 예외 발생
			System.out.println("저장된 리스트가 없습니다");

		} finally {
			out = new ObjectOutputStream(new FileOutputStream("object.dat"));
			while (true) {
				System.out.print("1:리스트에 저장  2:저자검색  3:종료 ---->");
				int menu = scan.nextInt();
				if (menu == 1) {
					System.out.print("도서명, 저자, 관리번호를 입력하세요 :");
					list.add(new Book(scan.next(), scan.next(), scan.next()));
				} else if (menu == 2) {
					System.out.print("저자명을 입력하세요: ");
					String author = scan.next();
					for (int i = 0; i < list.size(); i++) {
						if (list.get(i).getAuthor().equals(author)) {
							list.get(i).disPlay();
						}
					}
				} else if (menu == 3) {
					System.out.println("리스트를 파일에 저장합니다");
					out.writeObject(list);
					System.out.println("프로그램을 종료합니다");
					break;
				} else {
					System.out.println("입력오류");
				}
			}
		}

	}
}
