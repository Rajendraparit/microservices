package com.infosys.oops;
 class ParentEx {//Object ,this-v,m,c,o,super
	static int a=10;
	public ParentEx() {	
		this(12);
		System.out.println("dafault constructor of parent");
	}
	ParentEx(int a) 
	{
		System.out.println("Parent class parameterized constuructor"+a);
	}
	public  void m1() {
		System.out.println("Parent class method");
	};
	
	}
class SuperEx  extends ParentEx //is-a
{
static	int a=20;//declaration
	SuperEx() 
	{
		//super();//super()
		super.m1();//parent method calling
		this.m1();//current class method calling
		System.out.println(this.a);//20
		System.out.println(super.a);//10
		System.out.println(this);//	current class object
		
		System.out.println("child class constuructor");
	}
	@Override
	public void m1()
	{	
		System.out.println("child class method");
	}
	public static void main(String args[]) 
	{
		SuperEx e=new SuperEx();//default constructor
		System.out.println(e);//obj ref will print address of SuperEx class obj(e) in hexa decimal format
		
		ParentEx p= new ParentEx();//param constrcutor
		System.out.println(p.toString());
	}
}