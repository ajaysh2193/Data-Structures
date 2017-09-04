package com.Strings;
import java.util.Scanner;

public class PatternMatchingWithoutUsingBuiltInMethod {

	public static void main(String[] args) {

		String text = "";
		String pattern = "";
		System.out.println("Enter the text : " + text);
		System.out.println("Enter the pattern to matched : " + pattern);

		Scanner scan = new Scanner(System.in);
		text = scan.nextLine();
		pattern = scan.nextLine();

		int count = 0;

		int tlen = text.length();
		int plen = pattern.length();

		char c, p;

		for (int i = 0; i < tlen - plen; i++) {
			c = text.charAt(i);
			p = pattern.charAt(0);

			{
				if (c == p) {
					for (int j = i, k = 0; j < i + plen; j++, k++) {
						c = text.charAt(j);
						p = pattern.charAt(k);
						{
							if (c == p)
								count++;
						}
					}
				}
			}
		}

		if (count == plen)
			System.out.println("Pattern Matched");
		else
			System.out.println("Pattern not matched");
		scan.close();

	}

}
