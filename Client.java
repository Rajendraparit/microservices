package com.infosys.oops;

public class Client {
public static void main(String[] args) {
	Employee emp=new Employee();
	emp.setEmpId(123);
	emp.setEmpName("jagdeesh");
	emp.setAddress("hyderabad");
	emp.setEmpSal(90000);
	
	
	System.out.println(emp.getEmpName());
	
}
}
