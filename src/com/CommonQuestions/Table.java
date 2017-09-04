package com.CommonQuestions;
import java.util.Scanner;

public class Table {
	public static void main(String[] args) {
		int i, no, table = 1;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number: ");
		no = s.nextInt();
		for (i = 1; i <= 10; i++) {
			table = no * i;
			System.out.println(table);
		}
	}
}