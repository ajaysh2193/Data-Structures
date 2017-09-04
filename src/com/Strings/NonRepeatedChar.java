package com.Strings;
import java.util.Scanner;

public class NonRepeatedChar {

	public static void main(String[] args) {

		System.out.print("Enter string : ");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		scan.close();
		for (char c : str.toCharArray()) {
			if (str.indexOf(c) == str.lastIndexOf(c)) {
				System.out.println(c);
			}
		}
	}

}
