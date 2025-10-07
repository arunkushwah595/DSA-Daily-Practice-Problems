package LEETCODE;

import java.util.Arrays;

public class Climbing_Stairs_70 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		System.out.println(climbStairs(n));
	}

	public static int climbStairs(int n) {
		int[] dp = new int[n + 1];
		Arrays.fill(dp, -1);
		return climb(n, dp);
	}

	public static int climb(int n, int[] dp) {
		if (n < 0) {
			return 0;
		}
		if (n == 0) {
			return 1;
		}
		if (dp[n] != -1) {
			return dp[n];
		}
		int s1 = climb(n - 1, dp);
		int s2 = climb(n - 2, dp);

		return dp[n] = (s1 + s2);
	}

}
