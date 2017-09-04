package com.Strings;

public class StringConverter {

	public static String convert(String str) {
		StringBuffer sb = new StringBuffer(str);

		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i) < 48 || sb.charAt(i) > 57) {
				sb.deleteCharAt(i);
				i--;
			}
		}

		return sb.toString();
	}

	public static void main(String[] args) {

		String str = "9810eT490w0$76";
		str = convert(str);
		System.out.println(str);

	}

}
