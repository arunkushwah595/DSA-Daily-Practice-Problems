package LEETCODE;

import java.util.Arrays;

public class Maximum_Path_Score_in_a_Grid_leetcode {

	public static void main(String[] args) {
		int[][] grid = { { 0, 1 }, { 2, 0 } };
		int k = 1;
		System.out.println(maxPathScore(grid, k));
	}

	public static int maxPathScore(int[][] grid, int k) {
		int[][][] dp = new int[grid.length][grid[0].length][k + 1];
		for (int[][] arr : dp) {
			for (int[] a : arr) {
				Arrays.fill(a, -10000);
			}
		}
		return maxPath(grid, k, 0, 0, dp);
	}

	public static int maxPath(int[][] arr, int k, int i, int j, int[][][] dp) {

		if (i >= arr.length || j >= arr[0].length || k < 0) {
			return -1;
		}

		int cost = (arr[i][j] == 0) ? 0 : 1;
		if (i == 0 && j == 0) {
			cost = 0;
		}

		if (k - cost < 0) {
			return -1;
		}

		if (i == arr.length - 1 && j == arr[0].length - 1) {
			return arr[i][j];
		}

		if (dp[i][j][k] != -10000) {
			return dp[i][j][k];
		}

		int a = maxPath(arr, k - cost, i + 1, j, dp);
		int b = maxPath(arr, k - cost, i, j + 1, dp);

		int c = Math.max(a, b);
		if (c != -1) {
			c = c + arr[i][j];
		}

		return dp[i][j][k] = c;

	}

}
