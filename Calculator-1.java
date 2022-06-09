package com.infosys.oops;

import java.util.Date;
//by default package for every java file is java.lang
//by default parent for every java class is java.lang.Object
class SuperParent
{
public Date PrintDate()
{
return new Date();	
}

}
class Parent extends SuperParent {
	int salary=12222;
	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public void sub(int a, int b) {
		System.out.println(a - b);
	}

	public void mul(int a, int b) {
		System.out.println(a * b);
	}
}

public class Calculator extends Parent{
	public void div(int a, int b) {
		System.out.println(a / b);
	}

	public void mod(int a, int b) {
		System.out.println(a % b);
	}

	public static void main(String[] args) {
		Calculator calc=new Calculator();
					calc.mod(12,23);
					calc.div(22, 2);
					calc.mul(12,2);
					calc.add(2, 2);
					calc.sub(11, 2);
					
					System.out.println(calc.PrintDate());
					System.out.println(calc.salary);
	}

}
