package InterviewPreparation;

import java.util.ArrayList;
import java.util.List;

public class GenerateAllValidCombination {
	/*
	 * input = 3 output = [{{{}}}, {{}{}}, {{}}{}, {}{{}}, {}{}{}]
	 * 
	 * generate all valid combinations of balanced braces ({}) for a given number of
	 * pairs
	 * 
	 * 
	 */

	public static void main(String[] args) {

		int input = 3;
		List<String> list = new ArrayList<>();

		process(list, "", 0, 0, input);

		System.out.println(list);

	}

	static void process(List<String> list, String str, Integer open, Integer close, Integer max) {

		if (str.length() == max * 2)
			list.add(str);

		if (open < max) {
			process(list, str + "{", open + 1, close, max);
		}

		if (close < open) {
			process(list, str + "}", open, close + 1, max);
		}

	}
}
