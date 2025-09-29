package LEETCODE;

import java.util.Stack;

public class Help_Classmate_GFG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 3, 8, 5, 2, 25 };
		int ans[] = helpclassmate(arr);
		for (int i : ans) {
			System.out.println(i);
		}
	}

	public static int[] helpclassmate(int arr[]) {
		// Your code goes here
		int[] ans = new int[arr.length];
		Stack<Integer> st = new Stack<Integer>();
		for (int i = 0; i < arr.length; i++) {
			while (!st.isEmpty() && arr[i] < arr[st.peek()]) {
				ans[st.pop()] = arr[i];

			}
			st.push(i);
		}
		while (!st.isEmpty()) {
			ans[st.pop()] = -1;

		}
		return ans;
	}

}
