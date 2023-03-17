package com.bridgelabz.arrayhandling;

public class SmallestElements {

	public static void main(String[] args) {

		int arr[] = { 30, 40, 50, 10, 20 };
		int smallest = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < smallest)
				smallest = arr[i];
		}
		System.out.println(smallest);

	}
}
