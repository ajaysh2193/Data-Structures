package com.Arrays;

import java.util.Arrays;
import java.util.Collections;

public class KthNo {

	public static void main(String[] args) {

		Integer a[] = new Integer[] { 20, 76, 19, 101, 11, 52, 4, 36 };

		int k = 3;
		System.out.println("kth largest no : ");
		Arrays.sort(a, Collections.reverseOrder());
		for (int i = 0; i < k; i++) {
			System.out.println(a[i]);
		}
		System.out.println();

		System.out.println("kth smallest no : ");
		Arrays.sort(a);
		for (int i = 0; i < k; i++) {
			System.out.println(a[i]);
		}
	}
}
