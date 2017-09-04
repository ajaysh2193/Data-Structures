package com.CommonQuestions;

import java.util.Scanner;

public class Armstrong {
	/*
	 * armstrong number is whose sum of cubes of digit is equal to number itself
	 */

	public static void main(String[] args) {

		int n, c = 0, temp, a;

		System.out.print("Enter any number : ");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		temp = n;
		while (n > 0) {
			a = n % 10;
			n = n / 10;
			c = c + (a * a * a);
		}

		if (temp == c)
			System.out.println(" is armstrong number");

		else
			System.out.println(" is not armstrong number");
		scan.close();

	}

}
