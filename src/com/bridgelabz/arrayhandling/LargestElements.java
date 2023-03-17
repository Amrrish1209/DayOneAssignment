package com.bridgelabz.arrayhandling;

public class LargestElements {

	public static void main(String[] args) {

		int arr[] = { 30, 40, 50, 10, 20 };
		int largest = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest)
				largest = arr[i];
		}
		System.out.println(largest);
	}
}
