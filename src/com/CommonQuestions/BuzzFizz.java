package com.CommonQuestions;
import java.util.Scanner;

public class BuzzFizz {

	/*
	 * multiples of 3 should be replaced with "Fizz", multiples of 5 should be
	 * replaced with "Buzz" and multiples of both 3 and 5 should be replaced
	 * with "FizzBuzz"
	 */

	public static void main(String arg[]) {
		int no, i;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter range of numbers");
		no = s.nextInt();
		for (i = 1; i <= no; i++) {
			if ((i % (3 * 5)) == 0) {
				System.out.println("FizzBuzz\n");
			} else if ((i % 5) == 0) {
				System.out.println("Buzz\n");
			} else if ((i % 3) == 0) {
				System.out.println("Fizz\n");
			} else {
				System.out.println(i);
			}
		}
	}
}