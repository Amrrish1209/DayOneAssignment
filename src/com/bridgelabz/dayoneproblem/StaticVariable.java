package com.bridgelabz.dayoneproblem;

public class StaticVariable {

	static int x = 10;
	static int y;

	public static void main(String[] args) {
		y = x + 5;
		func(8);
	}

	public static void func(int z) {

		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}
