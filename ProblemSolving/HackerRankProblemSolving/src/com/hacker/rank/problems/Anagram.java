package com.hacker.rank.problems;

public class Anagram {

	public static void main(String[] args) {
		String input1 = "hellol";
		String input2 = "hello";

		System.out.println("Input1 : " + input1 + "Input2 : " + input2);

		char[] input1LowerCase = input1.toLowerCase().toCharArray();
		char[] input2LowerCase = input2.toLowerCase().toCharArray();

		// System.out.println("Input1lowerCase : " + input1LowerCase + " input2lowercase
		// : " + input2LowerCase.hashCode());

		char temp;

		for (int i = 0; i < input1LowerCase.length; i++) {
			for (int j = 0; j < input1LowerCase.length; j++) {
				if (input1LowerCase[i] < input1LowerCase[j]) {
					temp = input1LowerCase[i];
					input1LowerCase[i] = input1LowerCase[j];
					input1LowerCase[j] = temp;
				}
			}
		}

		for (int i = 0; i < input2LowerCase.length; i++) {
			for (int j = 0; j < input2LowerCase.length; j++) {
				if (input2LowerCase[i] < input2LowerCase[j]) {
					temp = input2LowerCase[i];
					input2LowerCase[i] = input2LowerCase[j];
					input2LowerCase[j] = temp;
				}
			}
		}

		String output1 = new String(input1LowerCase);
		System.out.println(output1);

		String output2 = new String(input2LowerCase);
		System.out.println(output1);

		if (output1.equals(output2))
			System.out.println("Given String Anagram");
		else
			System.out.println("Given String is Not a Anagram");

	}
}
