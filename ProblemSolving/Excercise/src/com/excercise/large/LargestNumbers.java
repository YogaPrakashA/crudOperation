package com.excercise.large;

public class LargestNumbers {

	public static void main(String[] args) {
		int[] array = { 10, 4, 3, 50, 23, 90 };
		findLargestNumbers(array);
	}

	public static void findLargestNumbers(int[] array) {
		int first;
		int second;
		int third;

		third = first = second = Integer.MIN_VALUE;

		int arraySize = array.length;

		if (arraySize == 0)
			System.out.print("We can't process because Array Size Zero");
		else {
			for (int i = 0; i <= arraySize; i++) {
				if (array[i] > first) {

				}
			}

		}

	}

}
