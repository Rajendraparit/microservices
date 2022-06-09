package com.infosys.collections;

import java.util.ArrayList;
import java.util.Iterator;

//homogeneous,heterogeneous data can be store
//not fixed in size,growable in nature

//duplicates are allowed,insertion order is preserved 

public class ListEx {// java.util.List
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();// 10
		names.add("amit");
		names.add("rama");
		names.add("manoj");
		names.add("naveen");
		names.add("nikhil");
		names.add("manoj");
		System.out.println(names);

		Iterator<String> result = names.iterator();

		while (result.hasNext()) {
			System.out.println(result.next());
		}
		for (String name : names) {
			System.out.println(name);
		}
	}
}
