package com.CommonQuestions;
import java.util.Scanner;

public class Factorial {

	static long factorial() {
		/*
		 * Using recursion
		 * int result; 
		 * if (num == 1) 
		 * return num; 
		 * result = factorial(num - 1) * num; 
		 * return result;
		 */

        System.out.print("Enter number : ");		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		long fact = 1;
		while (num > 0)
			fact *= num--;
		return fact;
	}

	public static void main(String[] args) {

		System.out.println("Factorial is : " + Factorial.factorial());

	}

}
