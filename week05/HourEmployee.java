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
		return "�̸�: " + name + ", ���: " + id + ", �ð��� �ӱ�: " + hourly_wage + ", ���ѽð�: " + worktime + ", �ݾ�: "
				+ computeSalary();
	}

	public int computeSalary() {
		return hourly_wage * worktime;
	}
}
