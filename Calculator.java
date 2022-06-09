package com.infosys.basic;

class Calculator {

	public static int addOfTwo(int a, int b) {
		return a + b;
	}

	public static void divOfTwo(int a, int b) {
		System.out.println(a / b);
	}

	public void subOfTwo(int a, int b)// instance method with no return
	{
		System.out.println(a - b);
	}

	public void mulOfTwo()// default method
	{
		int a = 23;
		int b = 2;
		System.out.println(a * b);
	}

	public int modOfTwo(int a, int b) {
		return a % b;

	}

	public static void main(String[] args) {

		int result = Calculator.addOfTwo(23, 24);
		System.out.println(result);
		Calculator.divOfTwo(12, 4);
		Calculator obj = new Calculator();
		obj.subOfTwo(12, 2);
		obj.mulOfTwo();
		System.out.println(obj.modOfTwo(12, 3));

	}
}
