package LEETCODE;

import java.util.Stack;

public class Reverse_a_String_using_Stack_gfg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "geeksforgeeks";
		System.out.println(reverse(s));
	}

	public static String reverse(String s) {
		Stack<Character> st = new Stack<>();
		for (char c : s.toCharArray()) {
			st.push(c);
		}
		StringBuilder sb = new StringBuilder();
		while (!st.isEmpty()) {
			sb.append(st.pop());
		}
		return sb.toString();
	}

}
