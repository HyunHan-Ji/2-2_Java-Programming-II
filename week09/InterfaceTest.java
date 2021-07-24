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
			System.out.println(str + "를 재생합니다.");
		};
		FStop stop = (String str) -> {
			System.out.println(str + "를 종료합니다.");
		};

		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("기기를 선택하세요");
			String str = null;
			System.out.print("1:MP3 2:CDPlay 3:WindowMediaPlay 4:종료 ==>");
			int menu = scan.nextInt();
			if (menu == 1) {
				str = "MP3";
			} else if (menu == 2) {
				str = "CDPlay";
			} else if (menu == 3) {
				str = "WindowMediaPlay";
			} else if (menu == 4) {
				System.out.println("프로그램을 종료합니다");
				break;
			} else {
				System.out.println("입력오류");
				continue;
			}

			System.out.println("해당 기기에 대한 동작을 선택하세요");
			System.out.print("1:Play 2:Stop ==>");
			int motion = scan.nextInt();
			if (motion == 1) {
				play.play(str);
			} else if (motion == 2) {
				stop.stop(str);
			} else {
				System.out.println("입력오류");
				continue;
			}
		}
	}
}
