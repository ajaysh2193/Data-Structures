package com.Strings;

public class StringBufferDemo {
	/*
	 * StringBuffer is mutable string, non-synchronized i.e.; thread-safe , less
	 * efficient than StringBuilder
	 */
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
		sb.append("Java");
		sb.insert(9, "world");
		System.out.println(sb);
		System.out.println(sb.reverse());

	}

}
