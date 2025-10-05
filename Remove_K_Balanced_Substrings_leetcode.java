package LEETCODE;

import java.util.Stack;

public class Remove_K_Balanced_Substrings_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "(())";
		int k = 1;
		System.out.println(removeSubstring(s, k));
	}

	public static String removeSubstring(String s, int k) {
		Stack<Character> st = new Stack<>();
		StringBuilder sb = new StringBuilder();
//		int close=0;
		int i = 0;

		while (i < s.length()) {
			if (s.charAt(i) == '(') {
				st.push('(');
				i++;
			} else {
				int close = 0;
				while (i < s.length() && s.charAt(i) == ')' && close < k) {
					close++;
					i++;
				}
				if (close == k && st.size() == k) {
					st.clear();
				} else if (close == k && st.size() > k) {
					for (int j = 0; j < k; j++) {
						st.pop();
					}
				} else if (close == k && st.size() < k) {
					int x = st.size();
					for (int j = 0; j < x; j++) {
						sb.append(st.pop());
					}
					while (close != 0) {
						sb.append(')');
						close--;
					}
				} else if (close < k) {
					int x = st.size();
					for (int j = 0; j < x; j++) {
						sb.append(st.pop());
					}
					while (close != 0) {
						sb.append(')');
						close--;
					}
				}

			}
		}
		while (!st.isEmpty()) {
			sb.append(st.pop());
		}
		return sb.toString();
	}

}
