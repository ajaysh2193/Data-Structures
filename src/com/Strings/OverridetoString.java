package com.Strings;
class A {
	String name;
	int rollNo;

	public A(String name, int rollNo) {

		this.name = name;
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		return "A [name=" + name + ", rollNo=" + rollNo + "]";
	}

}

public class OverridetoString {

	public static void main(String[] args) {

		A a = new A("Ajay", 101);
		System.out.println(a);

	}

}
