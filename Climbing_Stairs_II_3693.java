package LEETCODE;

import java.util.Arrays;

public class Climbing_Stairs_II_3693 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int[] costs = { 1, 2, 3, 4 };
		System.out.println(climbStairs(n, costs));
	}
	
	public static int climbStairs(int n, int[] costs) {
		int[] dp = new int[n + 1];
		Arrays.fill(dp, -1);
		return min_cost(n, costs, 0, dp);
	}

	public static int min_cost(int n, int[] costs, int i, int[] dp) {
		// TODO Auto-generated method stub
		if (i == n) {
			return 0;
		}
		if (dp[i] != -1) {
			return dp[i];
		}
		int mincost = Integer.MAX_VALUE;
		for (int j = i + 1; j <= i + 3; j++) {
			if (j <= n) {
				int self_cost = costs[j - 1] + (j - i) * (j - i);
				int total_cost = self_cost + min_cost(n, costs, j, dp);
				mincost = Math.min(mincost, total_cost);
			}
		}
		return dp[i] = mincost;
	}

}
