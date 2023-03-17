package com.bridgelabz.forloop;

import java.util.Scanner;

public class NaturalNumber {

	public static void main(String[] args) {

		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the natural numbers");
		number = sc.nextInt();
		int sum = 0;
		for (int i = 0; i <= number; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		sc.close();

	}
}
