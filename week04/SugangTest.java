package week04;
import java.util.*;;

public class SugangTest {
	public static void main(String[] args) {
		Sugang[] sugang= {new Sugang(28, "web"),  new Sugang(25, "java"),  new Sugang(35, "python"),  new Sugang(30, "script")};
		Scanner in = new Scanner(System.in);
			
		while(true) {
			System.out.print(">> 1.신청하기 2.출력하기 3.종료하기: ");
			int menu = in.nextInt();
			
			if(menu == 1) {
				System.out.print("과목명을 입력하세요: ");
				String title = in.next();
				for(int i=0; i<sugang.length; i++) {
					if(sugang[i].getTitle().equals(title)) {
						if(sugang[i].getSeat()==0) {
							System.out.println("잔여좌석이 없습니다.");
						}
						sugang[i].setCount(sugang[i].getCount()+1);
						sugang[i].setSeat((sugang[i].getSeat()-1));
						System.out.println("수강완료");
					}
				}
			}else if(menu == 2) {
				for(int i=0; i<sugang.length; i++) {
					System.out.printf("과목명: %s\t수강제한: %d\t 수강인원: %d\t잔여좌석: %d\n", sugang[i].getTitle(), sugang[i].getMaxcount(), sugang[i].getCount(), sugang[i].getSeat());
				}
			}else if(menu == 3) {
				System.out.println("프로그램을 종료합니다.");
				break;
				
			}else {
				System.out.println("잘못입력하셨습니다.");
			}
		}
	}
}
