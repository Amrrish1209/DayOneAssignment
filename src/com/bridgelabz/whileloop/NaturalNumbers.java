package com.bridgelabz.whileloop;

import java.util.Scanner;

public class NaturalNumbers {

	public static void main(String[] args) {

		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the natural numbers");
		number = sc.nextInt();
		int i = 0;
		int sum = 0;
		while (i <= number) {
			sum = sum + i;
			i++;
		}
		System.out.println(sum);
		sc.close();

	}
}
