package com.CommonQuestions;

import java.util.Scanner;

public class PrimeNo {
	// prime number or not
	public static void main(String[] args) {
		System.out.println("Enter number: ");
		int i, m = 0, n, flag = 0;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();

		m = n / 2;
		for (i = 2; i <= m; i++) {
			if (n % i == 0) {
				System.out.println("Number is not prime");
				flag = 1;
				break;
			}
		}
		if (flag == 0)
			System.out.println("Number is prime");
	}

}
