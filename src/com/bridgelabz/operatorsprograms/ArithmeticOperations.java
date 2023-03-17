package com.bridgelabz.operatorsprograms;

public class ArithmeticOperations {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int c = 5;
		int res1, res2, res3, res4;

		res1 = a + (b * c);
		System.out.println(res1);

		res2 = c + (a / b);
		System.out.println(res2);

		res3 = (a % b) + c;
		System.out.println(res3);

		res4 = (a * b) + c;
		System.out.println(res4);

		int arr[] = { res1, res2, res3, res4 };
		int max = arr[0];
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			} else if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("Maximum value is: " + max);
		System.out.println("Minimum value is: " + min);
	}
}
