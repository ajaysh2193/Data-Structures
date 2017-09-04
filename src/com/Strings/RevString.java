package com.Strings;
import java.util.Scanner;

public class RevString {

	public static void main(String[] args) {

		String original;
		String rev = "";

		System.out.println("Enter string to reverse : ");
		Scanner scan = new Scanner(System.in);

		original = scan.nextLine();

		/*
		 * StringBuffer sb = new StringBuffer(original); String rev =
		 * sb.reverse().toString(); System.out.println(rev);
		 */

		int length = original.length();

		for (int i = length - 1; i >= 0; i--) {
			rev = rev + original.charAt(i);
		}

		System.out.println(rev);

		scan.close();

	}
}
