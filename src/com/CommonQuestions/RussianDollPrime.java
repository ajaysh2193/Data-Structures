package com.CommonQuestions;

import java.util.Scanner;

public class RussianDollPrime {

	public static void main(String[] args) {

		System.out.print("Enter number : ");

		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int k;
		int n = x;

		for (k = String.valueOf(x).length() - 1; k > 0; k--) {
			if (isPrime(n)) {
				String m = String.valueOf(n).substring(0, k);
				n = Integer.parseInt(m);
				continue;

			} else {
				break;
			}
		}
		scan.close();

		if (k == 0) {
			System.out.println(x + " is Russian Doll Prime Number");
		} else {
			System.out.println(x + " is not Russian Doll Prime Number");
		}

	}

	private static boolean isPrime(int x) {
		boolean check = true;
		for (int i = 2; i < x / 2; i++) {
			if ((x % i) == 0) {

				check = false;

			}
		}

		return check;
	}
}
