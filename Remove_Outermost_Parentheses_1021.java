package LEETCODE;

import java.util.Stack;

public class Remove_Outermost_Parentheses_1021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "(()())(())";
		System.out.println(removeOuterParentheses(s));
	}

	public static String removeOuterParentheses(String s) {
		Stack<Integer> st = new Stack<>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == '(') {
				st.push(i);
			} else {
				int l = st.pop();
				if (st.isEmpty()) {
					sb.append(s.substring(l + 1, i));
				}
			}
		}
		return sb.toString();
	}

}
