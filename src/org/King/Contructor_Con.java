package org.King;

public class Contructor_Con {

	public Contructor_Con() {
		System.out.println("Contructor Concept");
	}
	public Contructor_Con(String n) {
		System.out.println("Display word: " + n);
		
	}
	public Contructor_Con(int i, long l) {
		System.out.println(i);
		System.out.println(l);
	}
	public Contructor_Con(int o, int p) {
		System.out.println(o);
		System.out.println(p);
	}
	public void name() {
		System.out.println("Suresh");
		
	}
	public static void main(String[] args) {
		Contructor_Con c1=new Contructor_Con();
		
		Contructor_Con q=new Contructor_Con("Best wishes");
		Contructor_Con q1=new Contructor_Con(12345, 600117);
		Contructor_Con q2=new Contructor_Con(66, 100);
		c1.name();
	}

}
