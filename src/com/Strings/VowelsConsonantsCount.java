package com.Strings;
import java.util.Scanner;

public class VowelsConsonantsCount {
	// B, C, D, F, G, H, J, K, L, M, N, P, Q, R, S, T, V, W, X, Y and Z are
	// consonants.
	public static void main(String[] args) {
		System.out.print("Enter string : ");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int count = 0;
		/*
		 * char[] ch = str.toCharArray(); for (char c : ch) { switch (c) { case
		 * 'a': case 'e': case 'i': case 'o': case 'u': case 'A': case 'E': case
		 * 'I': case 'O': case 'U': count++;
		 * 
		 * break;
		 * 
		 * } }
		 */
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {
				count++;
			}

		}

		System.out.println("No of vowels in string are " + count);
		scan.close();
	}

}
