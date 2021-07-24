package week05;

public class Answer1 {
	public static void main(String[] args) {
		Inkjet_P inkject=new Inkjet_P("한림시리즈", "한림","usb", 500, 1000);
		Laser_P laser = new Laser_P("융합시리즈", "융합", "port1", 1000, 3000);
		inkject.print();
		laser.print();
		System.out.println("잉크를 소비합니다");
		if(inkject.inkdec(350) == 0)
			System.out.println("잉크 잔량이 부족합니다");
		else
			inkject.print();
		
		System.out.println("토너를 소비합니다");
		if(inkject.inkdec(5000) == 0)
			System.out.println("토너 잔량이 부족합니다");
		else
			inkject.print();
	}
}

