package LEETCODE;

import java.util.Stack;

public class Delete_middle_element_of_a_stack_gfg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);

		// Before Delete
		System.out.println(st);

		delete(st, 0, st.size());

		// After Delete
		System.out.println(st);

	}

	public static void delete(Stack<Integer> st, int c, int size) {
		if (c == size / 2) {
			System.out.println(st.pop());
			return;
		}
		int n = st.pop();
		delete(st, c + 1, size);
		st.push(n);
	}

}
