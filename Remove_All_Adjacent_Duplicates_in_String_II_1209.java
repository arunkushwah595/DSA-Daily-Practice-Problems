package LEETCODE;

import java.util.Stack;

public class Remove_All_Adjacent_Duplicates_in_String_II_1209 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "deeedbbcccbdaa";
		int k = 3;
		System.out.println(removeDuplicates(s, k));
	}

	public static String removeDuplicates(String s, int k) {
		StringBuilder sb = new StringBuilder();
		Stack<Pair> st = new Stack<>();
		for (char ch : s.toCharArray()) {
			if (st.isEmpty() || st.peek().ch != ch) {
				st.push(new Pair(ch, 1));
			} else if (st.peek().ch == ch) {
				st.peek().count++;
			}

			if (!st.isEmpty() && st.peek().count == k) {
				st.pop();
			}
		}

		while (!st.isEmpty()) {
			Pair p = st.pop();
			for (int i = 0; i < p.count; i++) {
				sb.insert(0, p.ch);
			}
		}
		return sb.toString();

	}

	static class Pair {
		char ch;
		int count;

		public Pair(char ch, int count) {
			// TODO Auto-generated constructor stub
			this.ch = ch;
			this.count = count;
		}
	}

}
