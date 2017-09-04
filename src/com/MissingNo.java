package com.Arrays;
import java.util.Arrays;

public class MissingNo {

	public static void main(String[] args) {

		int a[] = {1,2,3,5,6};
		int missing = getMissingNumber(a, 6);
		System.out.println(Arrays.toString(a));
		System.out.println("Missing number in array is " + missing);
	}

	private static int getMissingNumber(int a[], int n) {
		int total = (n * (n + 1) / 2);
		int sum = 0;

		for (int i : a) {
			sum += i;
		}
		return total - sum;
	}
}
