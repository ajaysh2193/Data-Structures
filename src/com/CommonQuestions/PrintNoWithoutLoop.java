package com.CommonQuestions;

public class PrintNoWithoutLoop {

	public static void main(String[] args) {

		printNumbers(1);

	}

	static void printNumbers(int n) {
		if (n <= 10) {
			// print numbers 1 to 10 without using loop
			System.out.println(n);
			printNumbers(n + 1);

		}

	}

}
