package com.Sorting;

public class QuickSort {

	public static void quickSort(int a[], int low, int high) {
		int i = low, j = high;
		int temp;
		int pivot = a[(low + high) / 2];

		while (i <= j) {
			while (a[i] < pivot)
				i++;
			while (a[j] > pivot)
				j--;
			if (i <= j) {
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
		}
		if (low < j)
			quickSort(a, low, j);
		if (i < high)
			quickSort(a, i, high);
	}

	public static void main(String[] args) {

		int a[] = { 2, 4, 1, 7, 9, 6 };
		System.out.println("Before Sorting");

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}

		System.out.println();

		quickSort(a, 0, 5);
		System.out.println("Quick Sort ");

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}
	}

}
