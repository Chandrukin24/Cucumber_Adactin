package org.King;

public class String_Functions {

	public static void main(String[] args) {
		String r = "Hai update your details";
		String r1 = "Good morning have a nice day";
		String r2;

		String upperC = r.toUpperCase();
		System.out.println(upperC);

		String lowerC = r1.toLowerCase();
		System.out.println(lowerC);

		boolean contains = r.contains("update");
		System.out.println(contains);

		boolean equals = r1.equals(r1);
		System.out.println(equals);

		boolean startswidth = r1.startsWith("good");
		System.out.println(startswidth);

		boolean endsWith = r1.endsWith("day");
		System.out.println(endsWith);

		String replace = r1.replace("nice", "great");
		System.out.println(replace);

		String replaceAll = r1.replaceAll("Good morning have a nice day", "Great future");
		System.out.println(replaceAll);

		String substring = r.substring(4);
		System.out.println(substring);

		String substring2 = r.substring(4, 10);
		System.out.println(substring2);

		char charAt = r.charAt(5);
		System.out.println(charAt);

	}
}
