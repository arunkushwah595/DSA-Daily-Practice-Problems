package LEETCODE;

import java.util.Arrays;

public class Minimum_Falling_Path_Sum_II_1289 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println(minFallingPathSum(matrix));
	}

	public static int minFallingPathSum(int[][] grid) {
		int ans = Integer.MAX_VALUE;

		int[][] dp = new int[grid.length][grid[0].length];
		for (int[] a : dp) {
			Arrays.fill(a, -99999);
		}

		for (int col = 0; col < grid[0].length; col++) {
			ans = Math.min(ans, min_falling_path_sum(grid, 0, col, dp));
		}
		return ans;
	}

	public static int min_falling_path_sum(int[][] arr, int cr, int cc, int[][] dp) {
		if (cc < 0 || cc >= arr[0].length) {
			return 10000000;
		}
		if (cr == arr.length - 1) {
			return arr[cr][cc];
		}
		if (dp[cr][cc] != -99999) {
			return dp[cr][cc];
		}
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < arr[0].length; i++) {
			if (i == cc) {
				continue;
			}
			ans = Math.min(ans, min_falling_path_sum(arr, cr + 1, i, dp));
		}
		return dp[cr][cc] = ans + arr[cr][cc];
	}

}
