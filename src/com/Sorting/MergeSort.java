package com.Sorting;

public class MergeSort {

	public static void sort(int[] a, int low, int high) {
		int N = high - low;
		if (N <= 1)
			return;
		int mid = low + N / 2;
		sort(a, low, mid);
		sort(a, mid, high);
		int[] temp = new int[N];
		int i = low, j = mid;
		for (int k = 0; k < N; k++) {
			if (i == mid)
				temp[k] = a[j++];
			else if (j == high)
				temp[k] = a[i++];
			else if (a[j] < a[i])
				temp[k] = a[j++];
			else
				temp[k] = a[i++];
		}
		for (int k = 0; k < N; k++)
			a[low + k] = temp[k];
	}

	public static void main(String[] args) {
		int a[] = { 2, 4, 1, 7, 9, 6 };
		System.out.println("Before Sorting");

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}

		System.out.println();

		sort(a, 0, 6);
		System.out.println("Elements after sorting ");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + ",");
		System.out.println();

	}
}