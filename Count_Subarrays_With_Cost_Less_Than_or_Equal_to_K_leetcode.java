package LEETCODE;

import java.util.ArrayDeque;
import java.util.Deque;

public class Count_Subarrays_With_Cost_Less_Than_or_Equal_to_K_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 3, 2 };
		int k = 4;
		System.out.println(countSubarrays(nums, k));

	}

	public static long countSubarrays(int[] nums, long k) {
		Deque<Integer> maxdq = new ArrayDeque<>();
		Deque<Integer> mindq = new ArrayDeque<>();

		int l = 0;
		long ans = 0;

		for (int r = 0; r < nums.length; r++) {
			while (!maxdq.isEmpty() && nums[maxdq.peekLast()] < nums[r]) {
				maxdq.pollLast();
			}
			maxdq.addLast(r);
			while (!mindq.isEmpty() && nums[mindq.peekLast()] > nums[r]) {
				mindq.pollLast();
			}
			mindq.addLast(r);
			while ((long) (nums[maxdq.peekFirst()] - nums[mindq.peekFirst()]) * (r - l + 1) > k) {
				if (maxdq.peekFirst() == l) {
					maxdq.pollFirst();
				}
				if (mindq.peekFirst() == l) {
					mindq.pollFirst();
				}
				l++;
			}
			ans += (r - l + 1);
		}
		return ans;
	}

}
