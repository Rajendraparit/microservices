package com.infosys.oops;

import java.util.Date;
interface A
{
	}
interface ParentI extends A {
	// by default interface methods are public abstract
	// by default interface variables public static final
	 int marks=0;//public static final
	public abstract void m1();
	void m2();
	
}

abstract class Hello implements  ParentI {
	public void printTime() {
		System.out.println("Today's time : " + new Date().getHours());
	}
	public  void m1() {
		System.out.println("am from Hello class m1");
	}
	public abstract void sayHello();
}

public class AbstractionTest extends Hello {

	public void printDate() {
		System.out.println("Today's Date : " + new Date());
	}

	public static void main(String[] args) {
		AbstractionTest obj = new AbstractionTest();
		obj.printDate();
		obj.printTime();
		obj.sayHello();
	}

	public void sayHello() {
		System.out.println("time for BF");
	}

	
	@Override
	public void m2() {
		
	}

}
