package com.bridgelabz.forloop;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		num = sc.nextInt();
		int r = 0;
		int d;
		int temp = num;
		for (; num != 0; num = num / 10) {
			d = num % 10;
			r = r * 10 + d;
		}
		if (temp == r) {
			System.out.println(temp + " is a Palindrome number");
		} else {
			System.out.println(temp + " is not a Palindrome number");
		}
		sc.close();
	}
}
