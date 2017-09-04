package com.Strings;
import java.util.Scanner;

public class BasicStringOperations {
	public static void main(String[] args) {

		String s1;
		String s2;
		String s4 = "Ajay,Rahul,Priya,Sumit,Akash";
		String s5 ="   hie baby     ";
		

		System.out.println("Enter two strings : ");

		Scanner scan = new Scanner(System.in);
		s1 = scan.nextLine();
		s2 = scan.nextLine();

		String s3 = s1.concat(s2).toUpperCase(); // String s3 = s1 + s2;
		int value=30;  
		String str=String.valueOf(value);  

		System.out.println(s3 + "\n" + s3.length() + "\n" + s3.substring(2, 5));
		System.out.println(s1.compareTo(s2));
		System.out.println(str);
		System.out.println(s5.trim());

		scan.close();

		String names[] = s4.split(",");
		for (String values : names) {
			System.out.println(values);
		}

	}

}
