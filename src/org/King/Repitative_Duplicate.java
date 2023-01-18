package org.King;

public class Repitative_Duplicate {

	public static void main(String[] args) {
		String string = "I am Big Fan of Cricket Cricket Big Game This Game is Interesting";

		int count;

		String lowerCase = string.toLowerCase();
		System.out.println(lowerCase);
		System.out.println();

		String[] split = string.split(" ");
		for (String str : split) {
			System.out.println(str);
		}
		System.out.println();

		string = string.toUpperCase();
		System.out.println(string);
		System.out.println();
		System.out.println("Below mentioned name is Duplicate value: ");
		for (int i = 0; i < split.length; i++) {
			count = 1;
			for (int j = i + 1; j < split.length; j++) {
				if (split[i].equals(split[j])) {
					count++;
					split[j] = "0";
				}
			}
			if (count > 1 && split[i] != "0")
				System.out.println(split[i]);
		}
	}
}