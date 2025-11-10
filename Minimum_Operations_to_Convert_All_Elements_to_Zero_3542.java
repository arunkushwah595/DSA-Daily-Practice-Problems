package LEETCODE;

import java.util.Stack;

public class Minimum_Operations_to_Convert_All_Elements_to_Zero_3542 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = { 1, 2, 1, 2, 1, 2 };
		System.out.println(minOperations(nums));

	}

	public static int minOperations(int[] nums) {
		Stack<Integer> stack = new Stack<>();
		int ans = 0;
		for (int n : nums) {
			while (!stack.isEmpty() && stack.peek() > n)
				stack.pop();
			if (n == 0)
				continue;
			if (stack.isEmpty() || stack.peek() < n) {
				ans++;
				stack.push(n);
			}
		}
		return ans;
	}
}
