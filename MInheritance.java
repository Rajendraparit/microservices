package com.infosys.oops;

interface A1 {//100 %
	public void m1();
}

interface B {
	public void m1();
}

public class MInheritance implements A1,B
{

	public static void main(String[] args) {
		MInheritance obj=new MInheritance();
		obj.m1();
	}

	@Override
	public void m1() {
		System.out.println("missing GF/BF");
	}

}
