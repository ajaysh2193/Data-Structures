package com.Strings;
import java.util.Scanner;

class RemoveWhiteSpaces {
	public static void main(String[] args) {
		System.out.print("Enter string : ");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		scan.close();
		/*
		 * String strWithoutSpace = str.replaceAll("\\s", "");
		 * 
		 * System.out.println(strWithoutSpace);
		 */

		char[] strArray = str.toCharArray();

		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < strArray.length; i++) {
			if ((strArray[i] != ' ') && (strArray[i] != '\t')) {
				sb.append(strArray[i]);
			}
		}

		System.out.println(sb);
	}
}