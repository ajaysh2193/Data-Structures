package com.Sorting;

public class BubbleSort {

	static void doBubbleSort(int a[]) {
		int n = a.length;
		for (int k = 1; k < n; k++) {
			int flag = 0;
			for (int i = 0; i < n - k; i++) {
				if (a[i] > a[i + 1]) {
					int temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
					flag = 1;
				}
			}
			if (flag == 0)
				break;

		}
	}

	public static void main(String[] args) {

		int a[] = { 2, 4, 1, 7, 9, 6 };
		System.out.println("Before Sorting");

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}
		
		System.out.println();

		doBubbleSort(a);
		System.out.println("Bubble Sort");

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}

	}

}
