package org.employee;

public class EmployeeDetails {
	
	private void empName() {
		
		System.out.println("Employee Name is : Anand");
	}
	private void empMobNo() {
		
		System.out.println("Employee mobile no is : 8667070832");
	}
	
	public static void main(String[] args) {
		
		EmployeeDetails ed = new EmployeeDetails();
		
		ed.empName();
		ed.empMobNo();
		
	}
}
