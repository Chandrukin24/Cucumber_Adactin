package org.King;

public class Array_Concepts {

	public static void main(String[] args) {
		//syntax --> int a[] = new int [length];
		
		int a[] = new int [5];
		
		a[0] = 12;
		a[1] = 25;
		a[2] = 32;
		a[3] = 37;
		a[4] = 44;
		a[3] = 50;
		a[3] = 60;
		
		System.out.println(a.length);
		System.out.println();
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
