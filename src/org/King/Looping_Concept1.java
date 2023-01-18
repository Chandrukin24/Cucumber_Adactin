package org.King;

public class Looping_Concept1 {
	
	public static void main(String[] args) {
		
	// for initialization; condition; iteration)//

	for (int i = 1; i <=5; i++) {
		for (int j = 5; j >= 1; j--) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	System.out.println();
	
	int  b = 1;
	while (b <= 20) {
		System.out.println(b);
		b++;
	}
	do {
		System.out.println(b);
		b++;
	} while (b <= 30);
	
	}
}
