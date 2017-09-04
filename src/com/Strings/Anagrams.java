package com.Strings;
import java.util.Arrays;
import java.util.Scanner;

// Two strings are anagrams of they contain same characters but in different order
public class Anagrams {
	public static void main(String[] args) {
		System.out.println("Enter two strings : ");
		Scanner scan = new Scanner(System.in);
		String s1 = scan.nextLine();
		String s2 = scan.nextLine();
		char[] charArray1 = s1.toCharArray();
		StringBuilder sb = new StringBuilder(s2);
		for (char c : charArray1) {
			int index = sb.indexOf(String.valueOf(c));
			if (index != -1) {
				sb.deleteCharAt(index);
				System.out.println("Both strings are anagrams");
			} else
				System.out.println("Both strings are not anagrams");
	}
		
		/*
		 * char[] charArray2 = s2.toCharArray(); Arrays.sort(charArray1);
		 * Arrays.sort(charArray2); if (Arrays.equals(charArray1, charArray2)) {
		 * System.out.println("Both strings are anagrams"); } else
		 * System.out.println("Both strings are not anagrams");
		 */
		scan.close();
	}

}
