package com.Arrays;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Duplicate {

	public static void main(String[] args) {

		String str[] = { "java", "hibernate", "spring", "java", "struts" };
		/*
		 * Set<String> duplicate = new HashSet<>(); Set<String> nonDuplicate =
		 * new HashSet<>(); for (String s : str) { if
		 * (!nonDuplicate.contains(s)) nonDuplicate.add(s); else
		 * duplicate.add(s); } System.out.println(duplicate);
		 */

		Arrays.sort(str);
		for (int i = 0; i < str.length-1; i++) {
			if (str[i] == str[i + 1]) {
				System.out.println(str[i]);
			}
		}

	}

}
