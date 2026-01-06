package LEETCODE;

import java.util.Arrays;

public class Number_of_Longest_Increasing_Subsequence_673 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 3, 5, 4, 7 };
		System.out.println(findNumberOfLIS(nums));
	}

	public static int findNumberOfLIS(int[] nums) {
		int maxLen = 0;
		int[] dp = new int[nums.length];
		int[] count = new int[nums.length];
		Arrays.fill(dp, 1);
		Arrays.fill(count, 1);
		for (int i = 0; i < dp.length; i++) {
			for (int j = i - 1; j >= 0; j--) {
				if (nums[i] > nums[j]) {
					if (dp[j] + 1 > dp[i]) {
						dp[i] = dp[j] + 1;
						count[i] = count[j];
					} else if (dp[j] + 1 == dp[i]) {
						count[i] += count[j];
					}
				}
			}
			maxLen = Math.max(maxLen, dp[i]);
		}
		int ans = 0;
		for (int i = 0; i < nums.length; i++) {
			if (dp[i] == maxLen) {
				ans += count[i];
			}
		}
		return ans;
	}
}
