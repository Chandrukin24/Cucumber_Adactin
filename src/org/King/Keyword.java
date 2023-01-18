package org.King;

public class Keyword {

	static int b = 50; // Static Variable // Variable level

	int a = 100; // Class Variable

	private void name() {
		int b = 200; // Local variable
		b++;
		System.out.println(b);
		System.out.println(this.a); // current class reference
	}

	public static void main(String[] args) {
		Keyword n = new Keyword();
		n.name(); 				 // to call Local variable
		System.out.println(b);	 // to call Static variable
		System.out.println(n.a); // to call Class variable
	}

}
