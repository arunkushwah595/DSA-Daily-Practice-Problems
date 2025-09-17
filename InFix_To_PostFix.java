package Lec50;

import java.util.Stack;

public class InFix_To_PostFix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String infix = "5*(6+5)/9";
		System.out.println(getPostFix(infix));
	}

	public static String getPostFix(String s) {
		StringBuilder sb = new StringBuilder();
		Stack<Character> st = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= '0' && ch <= '9') {
				sb.append(ch);
			}

			else if (ch == '(') {
				st.push(ch);
			}

			else if (ch == ')') {
				while (st.peek() != '(') {
					sb.append(st.pop());
				}
				st.pop();
			}

			else {
				while (!st.isEmpty() && getValue(st.peek()) >= getValue(ch)) {
					sb.append(st.pop());
				}
				st.push(ch);
			}
		}
		while (!st.isEmpty()) {
			sb.append(st.pop());
		}
		return sb.toString();
	}

	public static int getValue(char ch) {
		if (ch == '*' || ch == '/') {
			return 2;
		} else if (ch == '+' || ch == '-') {
			return 1;
		} else {
			return -1;
		}
	}
}
