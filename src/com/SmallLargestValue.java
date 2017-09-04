package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SmallLargestValue {

	public static void main(String[] args) {
		int n;
		System.out.print("Enter size of array : ");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		System.out.println("Enter the elements");
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();

		}
		System.out.println(Arrays.toString(a));

		int smallestNo = Integer.MAX_VALUE;
		int largestNo = Integer.MIN_VALUE;
		for (int x : a) {
			if (x > largestNo)
				largestNo = x;
		}
		for (int x : a) {
			if (x < smallestNo)
				smallestNo = x;

		}
		System.out.println("Largest no in array is " + largestNo);
		System.out.println("Smallest no in array is " + smallestNo);
		// Print multiple repeated no
		Arrays.sort(a);
		for (int i = 0; i < (a.length) - 1; i++) {
			if (a[i] == a[i + 1]) {
				System.out.print("Repeated no are " + a[i] + "," + "\n");
			}
		}
		System.out.println(Arrays.toString(removeDuplicates(a)));
		scan.close();

	}

	// remove repeated No
	public static int[] removeDuplicates(int[] a) {
		if (a.length < 2)
			return a;

		int j = 0;
		int i = 1;

		while (i < a.length) {
			if (a[i] == a[j]) {
				i++;
			} else {
				j++;
				a[j] = a[i];
				i++;
			}
		}

		int[] B = Arrays.copyOf(a, j + 1);

		return B;

	}
}
