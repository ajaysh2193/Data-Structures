package com.Sorting;

public class SelectionSort {

	static void doSelectionSort(int a[]) {
		int n = a.length;
		for (int i = 0; i < n - 1; i++) {
			int iMin = i;
			for (int j = i + 1; j < n; j++) {
				if (a[j] < a[iMin])
					iMin = j;
			}

			int temp = a[i];
			a[i] = a[iMin];
			a[iMin] = temp;

		}

	}

	public static void main(String[] args) {

		int a[] = { 2, 4, 1, 7, 9, 6 };
		System.out.println("Before Sorting");

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}

		System.out.println();

		doSelectionSort(a);
		System.out.println("Selection Sort");

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}

	}
}
