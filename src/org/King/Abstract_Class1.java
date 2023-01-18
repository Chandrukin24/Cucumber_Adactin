package org.King;

public class Abstract_Class1 extends Abstract_Class {

	@Override
	public void SRM() {
		System.out.println("SRM Ticket rate is 30");
	}
	
	public static void main(String[] args) {
		Abstract_Class1 s = new Abstract_Class1();
		s.SRM();
		s.LKR();
		s.RED();
	}
}