package org.King;

import java.util.ArrayList;
import java.util.List;

public class Array_List {

	public static void main(String[] args) {
		List<Object> list1 = new ArrayList<Object>();
		System.out.println(list1);
		list1.add("MBA");
		list1.add(100);
		list1.add("Selenium");
		list1.add(78);
		list1.add(101);
		System.out.println(list1);
		int r = list1.size();
		System.out.println(r);
		Object sub = list1.get(4);
		System.out.println(sub);
		list1.set(3, 95);
		System.out.println(list1);
		list1.remove(4);
		System.out.println(list1);
		int toc = list1.indexOf(100);
		System.out.println(toc);
		boolean contains = list1.contains("M.B.A.");
		System.out.println(contains);
	}
}
