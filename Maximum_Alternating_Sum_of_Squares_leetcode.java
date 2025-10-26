package LEETCODE;

import java.util.*;

public class Maximum_Alternating_Sum_of_Squares_leetcode {

	public static void main(String[] args) {
		int[] nums = { 1, -1, 2, -2, 3, -3 };
		System.out.println(maxAlternatingSum(nums));
	}

	public static long maxAlternatingSum(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			nums[i] *= nums[i];
		}
		Arrays.sort(nums);
		int idx = nums.length / 2;
		long ans = 0l;
		for (int i = idx; i < nums.length; i++) {
			ans += nums[i];
		}
		for (int i = 0; i < idx; i++) {
			ans -= nums[i];
		}
		return ans;
	}

}
