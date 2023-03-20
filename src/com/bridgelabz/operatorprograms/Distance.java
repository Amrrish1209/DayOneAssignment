package com.bridgelabz.operatorprograms;

public class Distance {

	public static void main(String[] args) {
		
		  int x = Integer.parseInt(args[0]);
	        int y = Integer.parseInt(args[1]);

	        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

	        System.out.println("The Euclidean distance between (" + x + ", " + y + ") and (0, 0) is: " + distance);
		
	}
}
