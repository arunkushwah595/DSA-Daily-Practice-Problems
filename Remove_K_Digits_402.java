package LEETCODE;

import java.util.Stack;

public class Remove_K_Digits_402 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num = "1432219";
		int k = 3;
		System.out.println(minNo(num, k));

	}

	public static String minNo(String s, int k) {
		Stack<Character> st = new Stack<>();
		for (char i : s.toCharArray()) {
			while (!st.isEmpty() && k > 0 && st.peek() > i) {
				st.pop();
				k--;
			}
			st.push(i);
		}
		while (!st.isEmpty() && k > 0) {
			st.pop();
			k--;
		}
		StringBuilder sb = new StringBuilder();
		while (!st.isEmpty()) {
			sb.append(st.pop());
		}
		sb.reverse();
		while (sb.length() > 0 && sb.charAt(0) == '0') {
			sb.deleteCharAt(0);
		}
		if (sb.length() == 0) {
			return "0";
		}
		return sb.toString();
	}

}
