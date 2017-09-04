package com.CommonQuestions;
import java.io.IOException;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter number : ");
		String str = scan.nextLine();
		String temp ="" ;
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		str = sb.toString();
		if (temp.equalsIgnoreCase(str))
			System.out.println(temp + " is palindrome");
		else
			System.out.println(temp + " is not palindrome");

		scan.close();

	}

}
