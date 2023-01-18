package org.King;

public class Type_Of_Varia {

	int i = 50; //Class Variable
	static int b = 100;  //Static Variable

	private void joy() {   //method variable
		int i = 150;      //Local variable
		System.out.println(i);
	}

	public static void main(String[] args) {
		Type_Of_Varia s = new Type_Of_Varia();
		System.out.println(s.i);
		System.out.println(b);
		s.joy();
	}

}
