package week05;

public class Answer1 {
	public static void main(String[] args) {
		Inkjet_P inkject=new Inkjet_P("�Ѹ��ø���", "�Ѹ�","usb", 500, 1000);
		Laser_P laser = new Laser_P("���սø���", "����", "port1", 1000, 3000);
		inkject.print();
		laser.print();
		System.out.println("��ũ�� �Һ��մϴ�");
		if(inkject.inkdec(350) == 0)
			System.out.println("��ũ �ܷ��� �����մϴ�");
		else
			inkject.print();
		
		System.out.println("��ʸ� �Һ��մϴ�");
		if(inkject.inkdec(5000) == 0)
			System.out.println("��� �ܷ��� �����մϴ�");
		else
			inkject.print();
	}
}

