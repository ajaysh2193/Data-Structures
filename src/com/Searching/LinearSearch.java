package com.Searching;

public class LinearSearch {
	static int doLinearSearch(int a[], int x) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			if (a[i] == x)
				return i;
		}

		return -1;

	}

	public static void main(String[] args) {
		int a[] = { 2, 4, 1, 7, 9, 6 };

		System.out.print("Original Array : ");

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}

		System.out.println();
		System.out.println("Search element 7 found at index no. " + doLinearSearch(a, 7));

	}

}
