package LEETCODE;

import java.util.Stack;

public class Backspace_String_Compare_844 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ab#c", t = "ad#c";
		System.out.println(backspaceCompare(s, t));
	}

	public static boolean backspaceCompare(String S, String T) {
		Stack<Character> st1 = new Stack<Character>();
		Stack<Character> st2 = new Stack<Character>();
		for (char ch : S.toCharArray()) {
			if (ch == '#') {
				if (!st1.isEmpty()) {
					st1.pop();
				}
			} else {
				st1.push(ch);
			}
		}
		for (char ch : T.toCharArray()) {
			if (ch == '#') {
				if (!st2.isEmpty()) {
					st2.pop();
				}
			} else {
				st2.push(ch);
			}
		}
		if (st1.size() != st2.size()) {
			return false;
		}
		while (!st1.isEmpty()) {
			if (st1.pop() != st2.pop()) {
				return false;
			}
		}
		return true;
	}

}
