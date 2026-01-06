package LEETCODE;

public class Longest_Increasing_Path_in_a_Matrix_329 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = { { 9, 9, 4 }, { 6, 6, 8 }, { 2, 1, 1 } };
		System.out.println(longestIncreasingPath(matrix));
	}

	public static int longestIncreasingPath(int[][] matrix) {
		int max = 0;
		int[][] dp = new int[matrix.length][matrix[0].length];
		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[0].length; j++) {
				dp[i][j] = -1;
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				max = Math.max(max, LIP(matrix, dp, i, j));
			}
		}
		return max;
	}

	private static int LIP(int[][] matrix, int[][] dp, int i, int j) {
		// TODO Auto-generated method stub
		if (dp[i][j] != -1) {
			return dp[i][j];
		}
		int ans = 1;
		int[][] dir = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
		for (int[] d : dir) {
			int ni = i + d[0];
			int nj = j + d[1];
			if (ni >= 0 && nj >= 0 && ni < matrix.length && nj < matrix[0].length && matrix[ni][nj] > matrix[i][j]) {
				ans = Math.max(ans, 1 + LIP(matrix, dp, ni, nj));
			}
		}
		return dp[i][j] = ans;
	}
}
