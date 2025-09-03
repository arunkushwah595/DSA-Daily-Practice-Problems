package Lec47;

import java.util.Arrays;

public class House_Robber_198 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 2, 7, 9, 3, 1 };
		System.out.println(rob(nums));
		System.out.println(RobberBU(nums));
	}

	public static int rob(int[] nums) {
		int[] dp = new int[nums.length];
		Arrays.fill(dp, -1);
//		return Robber(nums, dp, 0);
		return Robber2(nums, dp, nums.length - 1);
	}

	public static int Robber(int[] arr, int[] dp, int i) {
		if (i >= arr.length) {
			return 0;
		}
		if (dp[i] != -1) {
			return dp[i];
		}
		int rob = arr[i] + Robber(arr, dp, i + 2);
		int Dont_rob = Robber(arr, dp, i + 1);
		return dp[i] = Math.max(rob, Dont_rob);
	}

	public static int Robber2(int[] arr, int[] dp, int i) {
		if (i < 0) {
			return 0;
		}
		if (dp[i] != -1) {
			return dp[i];
		}
		int rob = arr[i] + Robber2(arr, dp, i - 2);
		int Dont_rob = Robber2(arr, dp, i - 1);
		return dp[i] = Math.max(rob, Dont_rob);
	}

	public static int RobberBU(int[] arr) {
		if (arr.length == 1) {
			return arr[0];
		}
		int[] dp = new int[arr.length];
		dp[0] = arr[0];
		dp[1] = Math.max(arr[0], arr[1]);
		for (int i = 2; i < dp.length; i++) {
			int rob = arr[i] + dp[i - 2];
			int Dont_rob = dp[i - 1];
			dp[i] = Math.max(rob, Dont_rob);
		}
		return dp[dp.length - 1];
	}

}
