package com.bridgelabz.whileloop;

import java.util.Scanner;

public class ReverseIntegerNumber {

	public static void main(String[] args) {

		int num;
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		int r = 0;
		int d;
		while (num != 0) {
			d = num % 10;
			r = r * 10 + d;
			num = num / 10;
		}
		System.out.println(r);
		sc.close();

	}
}
