package LEETCODE;

import java.util.Arrays;

public class Absolute_Difference_Between_Maximum_and_Minimum_K_Elements_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 5, 2, 2, 4 };
		int k = 2;
		System.out.println(absDifference(nums, k));
	}

	public static int absDifference(int[] nums, int k) {
		if (k == nums.length) {
			return 0;
		}
		Arrays.sort(nums);
		int ls = 0, ss = 0;
		for (int i = 0; i < k; i++) {
			ss += nums[i];
		}
		for (int i = nums.length - k; i < nums.length; i++) {
			ls += nums[i];
		}
		return Math.abs(ls - ss);
	}

}
