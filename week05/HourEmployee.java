package week05;

public class HourEmployee extends Person {
	private int hourly_wage;
	private int worktime;

	public HourEmployee(String name, int id, int hourly_wage, int worktime) {
		super(name, id);
		this.hourly_wage = hourly_wage;
		this.worktime = worktime;
	}

	@Override
	public String toString() {
		return "이름: " + name + ", 사번: " + id + ", 시간당 임금: " + hourly_wage + ", 일한시간: " + worktime + ", 금액: "
				+ computeSalary();
	}

	public int computeSalary() {
		return hourly_wage * worktime;
	}
}
