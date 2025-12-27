package LEETCODE;

import java.util.Stack;

public class Resulting_String_After_Adjacent_Removals_3561 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "bcda";
		System.out.println(resultingString(s));
	}

	public static String resultingString(String s) {
		Stack<Character> st = new Stack<Character>();
		for (char ch : s.toCharArray()) {
			if (!st.isEmpty()) {
				if (Math.abs(ch - st.peek()) == 1) {
					st.pop();
					continue;
				}
				if (ch == 'a' && st.peek() == 'z') {
					st.pop();
					continue;
				}
				if (ch == 'z' && st.peek() == 'a') {
					st.pop();
					continue;
				}
			}
			st.push(ch);

		}
		StringBuilder sb = new StringBuilder();
		while (!st.isEmpty()) {
			sb.append(st.pop());
		}
		return sb.reverse().toString();
	}

}
