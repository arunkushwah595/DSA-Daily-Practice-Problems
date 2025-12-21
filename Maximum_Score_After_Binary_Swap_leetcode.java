package LEETCODE;

import java.util.Collections;
import java.util.PriorityQueue;

public class Maximum_Score_After_Binary_Swap_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 2, 1, 5, 2, 3 };
		String s = "01010";
		System.out.println(maximumScore(nums, s));
	}

	public static long maximumScore(int[] nums, String s) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		long ans = 0;
		for (int i = 0; i < nums.length; i++) {
			pq.add(nums[i]);
			if (s.charAt(i) == '1') {
				ans += pq.poll();
			}
		}
		return ans;
	}

}
