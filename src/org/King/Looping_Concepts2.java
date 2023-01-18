package org.King;

public class Looping_Concepts2 {
	public static void main(String[] args) {
		int b = 80;

		if (b > 40) {
			System.out.println("Pass");
		}

		else if (b == 40) {
			System.out.println("Just Pass");
		}

		else if (b != 40 || b == 40) {
			System.out.println("Fair Pass");
		}

		else {
			System.out.println("Fail");
		}
	}
}
