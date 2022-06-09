package com.infosys.oops;

public class MethodOverloadingEx {//signature
	public void add(short a, short b) {
		System.out.println(a + b);
	}
	public void add(float a, float b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		MethodOverloadingEx obj=new MethodOverloadingEx();
		obj.add(12, 13);
		obj.add(12.3f, 13.2f);
		obj.add('a','b');//type promotion
	}
}