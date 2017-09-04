package com.Strings;
import java.util.StringTokenizer;

public class StringTokenizerDemo {
	public static void main(String args[]) {
		StringTokenizer st = new StringTokenizer("my name is khan", " ");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		StringTokenizer str = new StringTokenizer("my,name,is,khan");

		System.out.println("Next token is : " + str.nextToken(","));
	}
}
