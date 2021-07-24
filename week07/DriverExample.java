package week07;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		driver.drive(bus); // 매개변수 다형성
		driver.drive(taxi);
	}
}
