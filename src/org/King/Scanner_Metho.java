package org.King;

import java.util.Scanner;

public class Scanner_Metho {

	public static void main(String[] args) {

		Scanner n = new Scanner(System.in);

		System.out.print("Name: ");
		String nextString = n.nextLine();

		System.out.println("Father's Name: ");
		String nextString2 = n.nextLine();

		System.out.println("Date of Birth: ");
		String nextString3 = n.nextLine();

		System.out.println("Marital Status: ");
		String nextString4 = n.nextLine();

		System.out.println("Address: ");
		String nextString5 = n.nextLine();

		System.out.println("Pincode: ");
		long nextLong = n.nextLong();

		System.out.println("Annual Income: ");
		float nextfloat = n.nextFloat();

	}
}
