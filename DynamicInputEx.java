package com.infosys.basic;

public class DynamicInputEx {

	//Wrapper classes byte,Byte,short-->Short,int-->Integer    java.lang
	public  static void main(String args[])// 12 13 rama "123.4"    Welcome 12+23=35    "12"+"23"=1223
	{
				int fNum=Integer.parseInt(args[0]);

				int sNum=Integer.parseInt(args[1]);
				int result=fNum+sNum;
				String name=args[2];
				
				float salary=Float.parseFloat(args[3]);
				
				
				long contact=Long.parseLong(args[4]);
				System.out.println(result+" :" +name+" "+salary+" "+contact);

		}

}
