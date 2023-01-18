package org.King;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class List_Iterator {

	public static void main(String[] args) {
		List<Object> mob = new LinkedList<Object>();
		System.out.println(mob);
		
		mob.add("Flight");
		mob.add(1000);
		mob.add(2500);
		mob.add("Train");
		mob.add(97.5);
		mob.add(250);
		System.out.println("Ticket types: " + mob);
		System.out.println();
		
		System.out.println("Forward Directions");
		ListIterator<Object> mob1 = mob.listIterator();
		while (mob1.hasNext()) {
			Object next = mob1.next();
			System.out.println(next); }
			System.out.println();

			System.out.println("Backward Directions");
			while (mob1.hasPrevious()) {
				Object prev = (Object) mob1.previous();
				System.out.println(prev);}
		}
	}