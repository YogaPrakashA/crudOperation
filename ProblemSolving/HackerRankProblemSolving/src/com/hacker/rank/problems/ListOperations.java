package com.hacker.rank.problems;

import java.util.Arrays;

public class ListOperations {

	static boolean isAnagram(String input, String input1) {

		int inputLen = input.length();
		int input1Len = input1.length();
		
		String inputLower = input.toLowerCase();
		String input1Lower = input1.toLowerCase();

		if (inputLen != input1Len)
			return false;

		char[] inputChar = inputLower.toCharArray();
		char[] input1Char = input1Lower.toCharArray();
		

		Arrays.sort(inputChar);
		Arrays.sort(input1Char);
		
		for(int i =0 ; i <inputLen ;i++) {
			if(inputChar[i] != input1Char[i])
				return false;
		}

		return true;
	}

	public static void main(String[] args) {
		String input = "Hello";
		String input1 = "hello";

		System.out.print(isAnagram(input, input1) ? "Anagram" : "Not Anagram");
	}

}
