package org.King;

public class Ascending_Order {

	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int check;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					check = a[i];
					a[i] = a[j];
					a[j] = check;

				}
			}

			System.out.println(a[i]);
		}
	}

}
