package week04;
import java.util.*;;

public class SugangTest {
	public static void main(String[] args) {
		Sugang[] sugang= {new Sugang(28, "web"),  new Sugang(25, "java"),  new Sugang(35, "python"),  new Sugang(30, "script")};
		Scanner in = new Scanner(System.in);
			
		while(true) {
			System.out.print(">> 1.��û�ϱ� 2.����ϱ� 3.�����ϱ�: ");
			int menu = in.nextInt();
			
			if(menu == 1) {
				System.out.print("������� �Է��ϼ���: ");
				String title = in.next();
				for(int i=0; i<sugang.length; i++) {
					if(sugang[i].getTitle().equals(title)) {
						if(sugang[i].getSeat()==0) {
							System.out.println("�ܿ��¼��� �����ϴ�.");
						}
						sugang[i].setCount(sugang[i].getCount()+1);
						sugang[i].setSeat((sugang[i].getSeat()-1));
						System.out.println("�����Ϸ�");
					}
				}
			}else if(menu == 2) {
				for(int i=0; i<sugang.length; i++) {
					System.out.printf("�����: %s\t��������: %d\t �����ο�: %d\t�ܿ��¼�: %d\n", sugang[i].getTitle(), sugang[i].getMaxcount(), sugang[i].getCount(), sugang[i].getSeat());
				}
			}else if(menu == 3) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
				
			}else {
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}
		}
	}
}
