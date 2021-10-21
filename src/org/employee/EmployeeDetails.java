package org.employee;

public class EmployeeDetails {
	
	private void empN() {
		
		System.out.println("Employee Name is : Anand");
	}
	private void empM() {
		
		System.out.println("Employee mobile no is : 8667070832");
	}
	
	private void empMob() {
		
		System.out.println("Employee mobile : 444");
	}
	
	public static void main(String[] args) {
		
		EmployeeDetails ed = new EmployeeDetails();
		
		ed.empN();
		ed.empM();
		
	}
}
