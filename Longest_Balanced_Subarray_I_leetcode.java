package LEETCODE;

import java.util.HashSet;
import java.util.Set;

public class Longest_Balanced_Subarray_I_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 2, 5, 4, 3 };
		System.out.println(distinct(nums));
	}

	public static int distinct(int[] nums) {
		int maxLen = 0;
		for (int i = 0; i < nums.length; i++) {
			Set<Integer> even = new HashSet<>();
			Set<Integer> odd = new HashSet<>();
			for (int j = i; j < nums.length; j++) {
				int n = nums[j];
				if (n % 2 == 0)
					even.add(n);
				else
					odd.add(n);
				if (even.size() == odd.size()) {
					maxLen = Math.max(maxLen, j - i + 1);
				}
			}
		}
		return maxLen;

	}

}
