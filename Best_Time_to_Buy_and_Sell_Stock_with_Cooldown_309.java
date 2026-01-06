package LEETCODE;

import java.util.Arrays;

public class Best_Time_to_Buy_and_Sell_Stock_with_Cooldown_309 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = { 1, 2, 3, 0, 2 };
		System.out.println(maxProfit(prices));
	}

	public static int maxProfit(int[] prices) {
		int[][] dp = new int[prices.length][2];
		for (int[] a : dp) {
			a[0] = -1;
			a[1] = -1;
		}
		return profit(prices, 0, 0, dp);
	}

	private static int profit(int[] prices, int i, int trans, int[][] dp) {
		// TODO Auto-generated method stub
		if (i >= prices.length) {
			return 0;
		}
		if (dp[i][trans] != -1) {
			return dp[i][trans];
		}
		if (trans == 0) {
			int buy = -prices[i] + profit(prices, i + 1, 1, dp);
			int skip = profit(prices, i + 1, trans, dp);
			return dp[i][trans] = Math.max(skip, buy);
		} else {
			int sell = prices[i] + profit(prices, i + 2, 0, dp);
			int skip = profit(prices, i + 1, 1, dp);
			return dp[i][trans] = Math.max(skip, sell);
		}
	}
}
