package com.Arrays;
import java.util.Arrays;
import java.util.HashSet;

public class FirstRepeatingNo {

	public static void main(String[] args) throws java.lang.Exception {
		int arr[] = { 10, 5, 3, 4, 3, 5, 6 };
		System.out.println(Arrays.toString(arr));
		printFirstRepeating(arr);
	}

	private static void printFirstRepeating(int arr[]) {
		int min = -1;

		HashSet<Integer> set = new HashSet<>();

		for (int i = arr.length - 1; i >= 0; i--) {
			if (set.contains(arr[i]))
				min = i;	

			else
				set.add(arr[i]);
		}

		if (min != -1)
			System.out.println("The first repeating element is " + arr[min]);
		else
			System.out.println("There are no repeating elements");
	}

}