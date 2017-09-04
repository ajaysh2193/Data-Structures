package com.Arrays;
import java.util.Scanner;

public class FirstNonRepeatingNo {

	public static void main(String[] args) {

		int n, count = 0, flag = 0;
		System.out.print("Enter the size of array : ");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		System.out.println("Enter the elements of array : ");
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		System.out.print("Non repeated elements are : ");
		{
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (i != j) {
						if (a[i] != a[j]) {
							flag = 1;
						} else
							flag = 0;
						break;
					}
				}
				if (flag == 1) {
					count++;
					System.out.print(a[i] + ",");
				}
			}
			System.out.println("");
			System.out.println("No of non-repeated elements are " + count);
			scan.close();
		}

	}

}
