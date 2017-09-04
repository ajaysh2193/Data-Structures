package com.Arrays;

import java.util.HashSet;

public class UnionIntersection {

	static int arr1[] = { 37, 100, 56, 55, 88, 219, 99, 92, 88 };
	static int arr2[] = { 101, 55, 88, 99, 32, 77, 37, 45 };

	public static void main(String[] args) {

		System.out.println("Union of two arrays is : ");
		printUnion();
		System.out.println("Intersection of two arrays is : ");
		printIntersection();

	}	

	static void printUnion() {
		HashSet<Integer> hs = new HashSet<>();

		for (int i = 0; i < arr1.length; i++) {
			hs.add(arr1[i]);
		}
		for (int i = 0; i < arr2.length; i++) {
			hs.add(arr2[i]);
		}

		System.out.println(hs);

	}

	// Prints intersection of arr1[0..m-1] and arr2[0..n-1]
	static void printIntersection() {
		HashSet<Integer> hs = new HashSet<>();
		HashSet<Integer> hs1 = new HashSet<>();

		for (int i = 0; i < arr1.length; i++) {
			hs.add(arr1[i]);
		}
		for (int i = 0; i < arr2.length; i++) {
			if (hs.contains(arr2[i])) {
				hs1.add(arr2[i]);
			}

		}

		System.out.println(hs1);
	}

}
