package com.Sorting;

public class InsertionSort {

	static void doInsertionSort(int a[]) {
		int n = a.length;
		for (int i = 0; i < n; i++) {

			int value = a[i];
			int hole = i;
			while (hole > 0 && a[hole - 1] > value) {
				a[hole] = a[hole - 1];
				hole = hole - 1;
			}
			a[hole] = value;

		}
	}

	public static void main(String[] args) {
		int a[] = { 2, 4, 1, 7, 9, 6 };
		System.out.println("Before Sorting");

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}

		System.out.println();

		doInsertionSort(a);
		System.out.println("Insertion Sort");

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}

	}

}
