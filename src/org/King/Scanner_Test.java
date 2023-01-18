package org.King;

import java.util.Scanner;

public class Scanner_Test {

	public static void main(String[] args) {
		Scanner ref = new Scanner(System.in);
		
		System.out.println("Emp Name: ");
		String new1 = ref.nextLine();
		
		System.out.println("Emp ID: ");
		int new2 = ref.nextInt();
		
		System.out.println("Emp Salary: ");
		long new3 = ref.nextLong();
		
		System.out.println("Emp height: ");
		float new4 = ref.nextFloat();
		
	}
}
