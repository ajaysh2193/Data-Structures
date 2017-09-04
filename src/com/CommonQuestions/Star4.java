package com.CommonQuestions;

public class Star4 {

	public static void main(String[] args) {

		String s = "JAVA";

		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= 4; j++) {

				if (i > j)
					System.out.print(" ");

				else
					System.out.print(s.charAt(j - 1) + " ");

			}

			System.out.println();
		}

	}
}
