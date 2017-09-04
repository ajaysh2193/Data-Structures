package com.Strings;
import java.util.Scanner;

public class CharCounter {

	public static void main(String[] args) {
		System.out.println("Enter string : ");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine().toLowerCase();
        System.out.println("Enter a character to count in the string : " + s);
		char c = scan.next(".").toLowerCase().charAt(0);
		int count = s.length() - s.replaceAll(String.valueOf(c), "").length();
		System.out.println(c + " occurs " + count + " times in " + s);
		scan.close();

	}
}
