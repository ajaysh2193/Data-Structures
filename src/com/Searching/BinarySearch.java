package com.Searching;

public class BinarySearch {

	static int doBinarySearch(int[] a, int key) {

		int n = a.length;
		int start = 0;
		int end = n - 1;
		int mid = (start + end) / 2;
		while (start <= end) {
			if (key == a[mid])
				return mid;
			else if (key < a[mid])
				return end = mid - 1;
			else
				return start = mid + 1;
		}
		return -1;

	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 4, 6, 7, 9 };

		System.out.print("Original Array : ");

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}

		System.out.println();
		System.out.println("Search element 6 found at index no. " + doBinarySearch(a, 6));

	}

}
