package Lec51;

import java.util.Arrays;

public class Burst_Balloons_312 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 3, 1, 5, 8 };
		System.out.println(maxCoins(nums));
	}

	public static int maxCoins(int[] nums) {
		int[] a = new int[nums.length + 2];
		a[0] = a[a.length - 1] = 1;
		for (int i = 0; i < nums.length; i++) {
			a[i + 1] = nums[i];
		}
		int[][] dp = new int[a.length][a.length];
		for (int[] ap : dp) {
			Arrays.fill(ap, -1);
		}
		return Burst_Coin(a, 0, a.length - 1, dp);
	}

	public static int Burst_Coin(int[] a, int i, int j, int[][] dp) {
		if (i + 1 == j) {
			return 0;
		}
		if (dp[i][j] != -1) {
			return dp[i][j];
		}
		int ans = Integer.MIN_VALUE;
		for (int k = i + 1; k < j; k++) {
			int left = Burst_Coin(a, i, k, dp);
			int right = Burst_Coin(a, k, j, dp);
			int self = a[i] * a[j] * a[k];
			ans = Math.max(ans, left + right + self);
		}
		return dp[i][j] = ans;
	}

}
