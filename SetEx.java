package com.infosys.collections;

import java.util.TreeSet;

//homogeneous,heterogeneous data allowed
//not fixed in size,growable in nature

//duplicates are not allowed,insertion order is not preserved 

public class SetEx {// java.util.List
	public static void main(String[] args) {
		TreeSet<String> names = new TreeSet();// 10
		names.add("amit");
		names.add("rama");
		names.add("manoj");
		names.add("naveen");
		names.add("nikhil");
		names.add("manoj");
		System.out.println(names);

	}
}
