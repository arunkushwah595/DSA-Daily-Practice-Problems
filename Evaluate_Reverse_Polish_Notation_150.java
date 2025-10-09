package LEETCODE;

import java.util.Stack;

public class Evaluate_Reverse_Polish_Notation_150 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] tokens = { "2", "1", "+", "3", "*" };
		System.out.println(evalRPN(tokens));
	}

	public static int evalRPN(String[] tokens) {
		Stack<Integer> st = new Stack<>();

		for (String s : tokens) {
			if (s.equals("+") || s.equals("-") || s.equals("/") || s.equals("*")) {
				int val2 = st.pop();
				int val1 = st.pop();

				if (s.equals("+")) {
					st.push(val1 + val2);
				}

				else if (s.equals("-")) {
					st.push(val1 - val2);
				}

				else if (s.equals("*")) {
					st.push(val1 * val2);
				}

				else {
					st.push(val1 / val2);
				}
			}

			else
				st.push(Integer.parseInt(s));
		}
		return st.pop();
	}

}
