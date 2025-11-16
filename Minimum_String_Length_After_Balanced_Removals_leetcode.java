package LEETCODE;

import java.util.Stack;

public class Minimum_String_Length_After_Balanced_Removals_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aaab";
		System.out.println(minLengthAfterRemovals(s));
	}

	public static int minLengthAfterRemovals(String s) {
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a') {
				if (!st.isEmpty() && st.peek() == 'b') {
					st.pop();
				} else {
					st.push('a');
				}
			} else {
				if (!st.isEmpty() && st.peek() == 'a') {
					st.pop();
				} else {
					st.push('b');
				}
			}
		}
		return st.size();
	}

}
