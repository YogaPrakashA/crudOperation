package com.excercise.large;

import java.util.Arrays;
import java.util.List;

public class StreamApiConcepts {

	public static void main(String[] args) {

		List<Integer> num = Arrays.asList(1, 10, 23, 45, 78, 23);

		num.forEach(n -> getValue(n));
	}

	public static void getValue(Integer n) {

		System.out.println("current value of n " + n);
	}
}
