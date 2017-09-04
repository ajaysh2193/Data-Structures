package com.Strings;
import java.util.Scanner;

public class PatternMatching {

	public static void main(String[] args) {

		String text = "";
		String patterns = "";
		System.out.println("Enter the text : " + text);
		System.out.println("Enter the pattern to matched : " + patterns);
		Scanner scan = new Scanner(System.in);
		text = scan.nextLine();
		patterns = scan.nextLine();

		boolean result = text.contains(patterns);

		if (result)
			System.out.println("Pattern matched");
		else
			System.out.println("Pattern not matched");

		scan.close();
	}

}
