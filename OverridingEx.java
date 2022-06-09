package com.infosys.oops;

import java.util.Date;

//final
class Parent1 {
	int age = 29;// final-->variable,method,class

	public void m1() {

		System.out.println("am from Parent1 m1 method");
	}

	public void printDate() {// final
		int age = 28;
		System.out.println("Today's Date : " + new Date() + " your age is :" + age);//28,this
	}
}

public class OverridingEx extends Parent1 {
	  int age=27;
	  OverridingEx(){
		  System.out.println("default constructor");
	  }
	  OverridingEx(String name){
		  System.out.println("param constructor :"+name);
	  }
	@Override
	public void printDate() {
		
		System.out.println("Today's Date : " + new Date().getDate()+"your age is : "+age);
	}
	public static void main(String[] args) {
		OverridingEx obj=new OverridingEx("time for tea break");
		obj.m1();
		obj.printDate();
	}
}
