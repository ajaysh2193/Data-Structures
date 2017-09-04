package com.CommonQuestions;
import java.util.Scanner;

public class Swapping {
	public static void main(String[] args) {
		int x, y, temp;

		System.out.println("enter x and y: ");
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		y = scan.nextInt();

		System.out.println("Before swapping \nx = " + x + "\ny = " + y);

		/*
		 * temp = x; Using third variable 
		 * temp x = y; 
		 * y = temp;
		 */

		x = x + y;
		y = x - y;
		x = x - y;

		System.out.println("After swapping \nx = " + x + "\ny = " + y);

	}

}
