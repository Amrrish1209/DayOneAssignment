package com.bridgelabz.ifelsestatement;

import java.util.Scanner;

public class SingleDigitNumber {

	public static void main(String[] args) {

		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Single Digit Number");
		number = sc.nextInt();
		if (number < 10 && number >= 0) {
			if (number == 0) {
				System.out.println("Zero");
			} else if (number == 1) {
				System.out.println("One");
			} else if (number == 2) {
				System.out.println("Two");
			} else if (number == 3) {
				System.out.println("Three");
			} else if (number == 4) {
				System.out.println("four");
			} else if (number == 5) {
				System.out.println("Five");
			} else if (number == 6) {
				System.out.println("Six");
			} else if (number == 7) {
				System.out.println("seven");
			} else if (number == 8) {
				System.out.println("Eight");
			} else if (number == 9) {
				System.out.println("nine");
			}
		} else {
			System.out.println("Enter the number in between 0 to 9");
		}
		sc.close();

	}
}
