package LEETCODE;

import java.util.Stack;

public class Basic_Calculator_II_227 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "3+2*2";
		System.out.println(calculate(s));
	}

	public static int calculate(String s) {
		Stack<Integer> st = new Stack<Integer>();
		char sign = '+';
		int tos = 0; // Top of Stack

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isDigit(ch)) {
				tos = tos * 10 + (ch - '0');
			}
			if ((!Character.isDigit(ch) && ch != ' ') || i == s.length() - 1) {
				if (sign == '+') {
					st.push(tos);
				} else if (sign == '-') {
					st.push(-tos);
				} else if (sign == '*') {
					st.push(st.pop() * tos);
				} else if (sign == '/') {
					st.push(st.pop() / tos);
				}
				sign = ch;
				tos = 0;
			}
		}

		int ans = 0;
		while (!st.isEmpty()) {
			ans += st.pop();
		}
		return ans;
	}

}
