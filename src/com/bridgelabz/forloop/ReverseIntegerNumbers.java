package com.bridgelabz.forloop;

import java.util.Scanner;

public class ReverseIntegerNumbers {

	public static void main(String[] args) {

		int num;
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		int r = 0;
		int d;
		for (; num != 0; num = num / 10) {
			d = num % 10;
			r = r * 10 + d;
		}
		System.out.println(r);
		sc.close();
	}
}
