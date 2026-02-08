package LEETCODE;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Merge_Adjacent_Equal_Elements_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 1, 2, 2 };
		System.out.println(mergeAdjacent(nums));

	}

	public static List<Long> mergeAdjacent(int[] nums) {
		Stack<Long> st = new Stack<>();
		for (int i : nums) {
			long val = i;
			while (!st.isEmpty() && st.peek() == val) {
				val += st.pop();
			}
			st.push(val);
		}
		List<Long> ll = new ArrayList<>();
		while (!st.isEmpty()) {
			ll.add(0, st.pop());
		}
		return ll;
	}

}
