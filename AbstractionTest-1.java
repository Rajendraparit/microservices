package com.infosys.oops;

import java.util.Date;

abstract class Hello {
	public void printTime() {
		System.out.println("Today's time : " + new Date().getHours());
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


}
