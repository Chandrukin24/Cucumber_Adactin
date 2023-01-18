package org.King;

public class MultiLevel_Inheri_Class2 extends MultiLevel_Inheri_Class1 {
public void college_name() {
	System.out.println("SRM College");
}
public static void main(String[] args) {
	MultiLevel_Inheri_Class2 p3 = new MultiLevel_Inheri_Class2();
	p3.student_name();
	p3.student_age();
	p3.college_name();
}
}
