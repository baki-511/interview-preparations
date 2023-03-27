package com.interview.recent;

public class Employee {
	public String employeeName;
	public int salary;
	public String department;
	public Employee(String employeeName, int salary, String department) {
		super();
		this.employeeName = employeeName;
		this.salary = salary;
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", salary=" + salary + ", department=" + department + "]";
	}
	
	
}
