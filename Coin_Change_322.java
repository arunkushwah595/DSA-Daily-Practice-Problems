package LEETCODE;

import java.util.Arrays;

public class Coin_Change_322 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins = { 1, 2, 5 };
		int amount = 11;
		System.out.println(coinChange(coins, amount));
	}

	public static int coinChange(int[] coins, int amount) {
		int[] dp = new int[amount + 1];
		Arrays.fill(dp, -1);
		Coin_Change(coins, amount, dp);
		if (amount == 0) {
			return 0;
		}
		if (dp[amount] >= Integer.MAX_VALUE - 1) {
			return -1;
		}
		return dp[amount];
	}

	public static int Coin_Change(int[] coin, int amount, int[] dp) {
		if (amount == 0) {
			return 0;
		}
		if (amount < 0) {
			return Integer.MAX_VALUE - 1;
		}
		if (dp[amount] != -1) {
			return dp[amount];
		}
		int ans = Integer.MAX_VALUE - 1;
		for (int i : coin) {
			int count = 1 + Coin_Change(coin, amount - i, dp);
			ans = Math.min(count, ans);
		}
		return dp[amount] = ans;
	}

}
