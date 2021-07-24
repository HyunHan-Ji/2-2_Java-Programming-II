package week05;

public class SalariedEmployee extends Person {
	private int month_salary;

	public SalariedEmployee(String name, int id, int month_salary) {
		super(name, id);
		this.month_salary = month_salary;
	}

	public int getMonth_salary() {
		return month_salary;
	}

	public void setMonth_salary(int month_salary) {
		this.month_salary = month_salary;
	}

	@Override
	public String toString() {
		return "�̸�: " + name + ", ���: " + id + ", ����: " + computerSalary();
	}

	public int computerSalary() {
		return month_salary * 12;
	}

}
