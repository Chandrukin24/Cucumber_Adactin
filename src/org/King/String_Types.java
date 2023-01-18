package org.King;
public class String_Types {

	public static void main(String[] args) {
		// String refname = " ";
		String r = "Hello world";  //Im mutable & Literal
		System.out.println(r);
		System.out.println(System.identityHashCode(r));

		String r1 = "Hello world";
		System.out.println(r1);
		System.out.println(System.identityHashCode(r1));

		r = r + " " + r1;
		System.out.println(r);
		System.out.println(System.identityHashCode(r));
		System.out.println();

		//Mutable & Non-Literal
		StringBuffer r3 = new StringBuffer("New Payament");
		System.out.println(r3);
		System.out.println(System.identityHashCode(r3));

		StringBuffer r4 = new StringBuffer("New Payament");
		System.out.println(r4);
		System.out.println(System.identityHashCode(r4));

		// r3.reverse();
		// System.out.println(r3);
		r3 = r3.append(r4);
		System.out.println(r3);
		System.out.println(System.identityHashCode(r3));
	}
}
