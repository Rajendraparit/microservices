package com.infosys.basic;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);// ctrl+Shift+O
		System.out.println("Enter your name :");
		String name=scan.next();
		System.out.println("Enter your age :");
		byte age=scan.nextByte();
		System.out.println("Enter your salary :");
		float salary=scan.nextFloat();
		System.out.println("Enter first number for addition :");
		int a = scan.nextInt();
		System.out.println("Enter second number for addition :");
		int b = scan.nextInt();
		int result = a + b;
		System.out.println(result);
		
		System.out.println(name+" "+age+" "+salary);
	}
}
