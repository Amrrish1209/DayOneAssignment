package com.bridgelabz.arrayhandling;

public class FrequencyEachElement {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 2, 3, 1, 4, 2, 5, 1, 6 };

		// Declare an array to store the frequency of each element
		int freq[] = new int[arr.length];

		// Loop through the array to count the frequency of each element
		for (int i = 0; i < arr.length; i++) {
			int count = 1;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					freq[j] = -1;
				}
			}

			if (freq[i] != -1) {
				freq[i] = count;
			}
		}

		// Print the frequency of each element
		System.out.println("Element\tFrequency");
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] != -1) {
				System.out.println(arr[i] + "\t" + freq[i]);
			}
		}
	}
}
