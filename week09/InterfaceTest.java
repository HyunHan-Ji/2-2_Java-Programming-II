package week09;

import java.util.Scanner;

interface FPlay {
	void play(String str);
}

interface FStop {
	void stop(String str);
}

public class InterfaceTest {
	public static void main(String[] args) {
		FPlay play = (String str) -> {
			System.out.println(str + "�� ����մϴ�.");
		};
		FStop stop = (String str) -> {
			System.out.println(str + "�� �����մϴ�.");
		};

		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("��⸦ �����ϼ���");
			String str = null;
			System.out.print("1:MP3 2:CDPlay 3:WindowMediaPlay 4:���� ==>");
			int menu = scan.nextInt();
			if (menu == 1) {
				str = "MP3";
			} else if (menu == 2) {
				str = "CDPlay";
			} else if (menu == 3) {
				str = "WindowMediaPlay";
			} else if (menu == 4) {
				System.out.println("���α׷��� �����մϴ�");
				break;
			} else {
				System.out.println("�Է¿���");
				continue;
			}

			System.out.println("�ش� ��⿡ ���� ������ �����ϼ���");
			System.out.print("1:Play 2:Stop ==>");
			int motion = scan.nextInt();
			if (motion == 1) {
				play.play(str);
			} else if (motion == 2) {
				stop.stop(str);
			} else {
				System.out.println("�Է¿���");
				continue;
			}
		}
	}
}
