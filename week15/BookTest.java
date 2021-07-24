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
			System.out.println("=== ����Ʈ ���� ��� ===");
			for (int i = 0; i < list.size(); i++) {
				list.get(i).disPlay();
			}
		} catch (EOFException e) { // ���Ͽ� ����� �����Ͱ� ������ EOFException ���� �߻�
			System.out.println("����� ����Ʈ�� �����ϴ�");

		} finally {
			out = new ObjectOutputStream(new FileOutputStream("object.dat"));
			while (true) {
				System.out.print("1:����Ʈ�� ����  2:���ڰ˻�  3:���� ---->");
				int menu = scan.nextInt();
				if (menu == 1) {
					System.out.print("������, ����, ������ȣ�� �Է��ϼ��� :");
					list.add(new Book(scan.next(), scan.next(), scan.next()));
				} else if (menu == 2) {
					System.out.print("���ڸ��� �Է��ϼ���: ");
					String author = scan.next();
					for (int i = 0; i < list.size(); i++) {
						if (list.get(i).getAuthor().equals(author)) {
							list.get(i).disPlay();
						}
					}
				} else if (menu == 3) {
					System.out.println("����Ʈ�� ���Ͽ� �����մϴ�");
					out.writeObject(list);
					System.out.println("���α׷��� �����մϴ�");
					break;
				} else {
					System.out.println("�Է¿���");
				}
			}
		}

	}
}
