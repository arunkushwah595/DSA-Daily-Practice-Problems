package LEETCODE;

import java.util.Arrays;

public class Perfect_Squares_279 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 12;
		System.out.println(numSquares(n));
	}

	public static int numSquares(int n) {
		int[] dp = new int[n + 1];
		Arrays.fill(dp, -1);
		Coin_Change(n, dp);
		if (n == 0) {
			return 0;
		}
		if (dp[n] >= Integer.MAX_VALUE - 1) {
			return -1;
		}
		return dp[n];
	}

	public static int Coin_Change(int n, int[] dp) {
		if (n == 0) {
			return 0;
		}
		if (n < 0) {
			return Integer.MAX_VALUE - 1;
		}
		if (dp[n] != -1) {
			return dp[n];
		}
		int ans = Integer.MAX_VALUE - 1;
		for (int i = 1; i <= Math.sqrt(n); i++) {
			int count = 1 + Coin_Change(n - i * i, dp);
			ans = Math.min(count, ans);
		}
		return dp[n] = ans;
	}

}
