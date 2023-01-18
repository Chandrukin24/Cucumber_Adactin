package org.King;

public class Odd_Even {

	public static void main(String[] args) {
		int s = 20;
		System.out.println("Odd" + " " + "Even");
		for (int i = 1; i <= s; i++) {
			if (i%2 <= 0) {
				System.out.println(i);
				System.out.println();
			}
			else 
				System.out.print(i + "   ");
		}
	}
}