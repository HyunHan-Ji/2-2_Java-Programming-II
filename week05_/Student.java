package week05_;

public class Student extends Person {
	private String num;
	private int grade;
	
	
	public Student(String name, int age, String num, int grade) {
		super(name, age);
		this.num = num;
		this.grade = grade;
	}
	
	

	@Override
	public void diPlay() {
		super.diPlay();
		System.out.printf("학번: %s\t자바성적: %d\n", num, grade);
	}
}
