package com.infosys.string;

public class StringExample {// java.lang.Object-->11,equals

	public static void main(String[] args) {

		String name = "infosys";
		String name1 = "infosys";
		name.concat(" hyderabad");// immutable
		System.out.println(name);//
		System.out.println(name.equals(name1));// true
		System.out.println(name1 == name);// t
		System.out.println(name.compareTo(name1));// 0
		// if obj1 has to come before obj2 compareto returns -ve
		// if obj1 has to come after obj2 compareto returns +ve
		// if both are same return zero

		String name3 = new String("infosys");
		String name4 = new String("infosys");

		System.out.println(name3.equals(name4));// true
		System.out.println(name3 == name4);// false

		StringBuffer sb = new StringBuffer("sleeping");//synchronized
		StringBuffer sb1 = new StringBuffer("sleeping");//not synch
		sb.append(" employees");
		System.out.println(sb);

		System.out.println(sb.equals(sb1));// f ==
		System.out.println(sb == sb1);// f
		
		

	}

}
