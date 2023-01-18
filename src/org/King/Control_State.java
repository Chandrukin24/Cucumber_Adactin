package org.King;

public class Control_State {

	public static void main(String[] args) {
		// for (initialization; Condition; iteration)

		for (int i = 0; i <5; i++) {
			System.out.println();

			for (int k = 5; k > i; k--) {
				System.out.print("$" + " ");
			}
		}
	}
}
