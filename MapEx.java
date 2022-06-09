package com.infosys.collections;

import java.util.TreeMap;

public class MapEx {
public static void main(String[] args) {
	TreeMap<Integer,String> values=new TreeMap();
	
	values.put(123, "suresh");
	values.put(124, "naresh");
	values.put(223, "rajesh");
	values.put(723, "mahesh");
	values.put(193, "rakesh");
	values.put(723, "dinesh");
	
	System.out.println(values);
}
}
