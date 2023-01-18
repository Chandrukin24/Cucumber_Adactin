package org.King;

import java.util.ArrayList;
import java.util.List;

public class ArrayListNew {
	public static void main(String[] args) {
		List<Object>list1 = new ArrayList<>();
		list1.add("MBA");
		list1.add(100);
		list1.add("Selenium");
		list1.add(78);
		list1.add(101);
		System.out.println("This is list1: " + list1);
		
		List<Object>list2 = new ArrayList<>();
		list2.add("MBA");
		list2.add(100);
		list2.add("Selenium");
		list2.add(78);
		list2.add("BCOM");
		System.out.println("This is list2: " + list2);
		//addAll()
		list1.addAll(list2);
		System.out.println(list1);
		//retainAll()
		list1.addAll(list2);
		System.out.println(list1);
		//removeAll
		list1.removeAll(list2);
		System.out.println(list1);
	}

}