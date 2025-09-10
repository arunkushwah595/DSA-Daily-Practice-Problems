package LEETCODE;

import java.util.Arrays;
import java.util.Iterator;

public class Minimum_Falling_Path_Sum_931 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = { { 2, 1, 3 }, { 6, 5, 4 }, { 7, 8, 9 } };
		System.out.println(minFallingPathSum(matrix));
	}

	public static int minFallingPathSum(int[][] matrix) {
		int ans = Integer.MAX_VALUE;

		int[][] dp = new int[matrix.length][matrix[0].length];
		for (int[] a : dp) {
			Arrays.fill(a, -99999);
		}

		for (int col = 0; col < matrix[0].length; col++) {
			ans = Math.min(ans, min_falling_path_sum(matrix, 0, col, dp));
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
		int ld = min_falling_path_sum(arr, cr + 1, cc - 1, dp); // Left Diagonal
		int down = min_falling_path_sum(arr, cr + 1, cc, dp);
		int rd = min_falling_path_sum(arr, cr + 1, cc + 1, dp); // Right diagonal
		return dp[cr][cc] = Math.min(Math.min(ld, rd), down) + arr[cr][cc];
	}

}
