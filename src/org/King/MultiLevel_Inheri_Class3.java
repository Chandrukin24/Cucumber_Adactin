package org.King;

public class MultiLevel_Inheri_Class3 extends MultiLevel_Inheri_Class2 {
	public void student_percentage() {
		System.out.println("80%");
	}
	public static void main(String[] args) {
		MultiLevel_Inheri_Class3 p5 = new MultiLevel_Inheri_Class3();
		p5.student_name();
		p5.student_age();
		p5.college_name();
		p5.student_percentage();
}
}
