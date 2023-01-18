package org.King;

public class Polymo_Overloading {
	private void com(String s) {
		System.out.println("Name: " + s);
	}

	private void com(int i, long l) {
		System.out.println("Bus No: " + i);
		System.out.println("Emp Salary: " + l);
	}

	private void com(char d1, char d2) {
		System.out.println("Bus type: " + d1);
		System.out.println("Gender M/F: " + d2);
	}

	public static void main(String[] args) {
		Polymo_Overloading g = new Polymo_Overloading();
		g.com("SRM");
		g.com(7297, 15000);
		g.com('A', 'M');
	}

}
