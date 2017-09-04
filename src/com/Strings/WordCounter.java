package com.Strings;
import java.util.Scanner;

public class WordCounter {

	public static void main(String[] args) {
		System.out.println("Enter string : ");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int count = 1;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == ' ' && str.charAt(0) == ' ') {
				count++;
			}
		}

		scan.close();
		System.out.println(count);
	}
}
