//Find the sum of maximum and minimum number from a given input array Input:{19,17,12} max - 19 min - 12 sum - 31 Output:31

package com.homework.numberscomparison;

public class NumbersComparison {
	public static void main(String[] args) {
		int a[] = { 19, 20, 30, 54, 45, 84, 11, 10, 60, 1 };
		int max = a[1];
		for (int i = 1; i > a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("max value of the array is: " + max);

		int min = a[0];
		for (int j = 1; j < a.length; j++) {
			if (a[j] < min) {
				min = a[j];

			}
		}
		System.out.println("Min value of the array is: " + min);
		System.out.println("Sum of Min and Max is: " + (min + max));
	}

}
