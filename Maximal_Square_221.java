package LEETCODE;

public class Maximal_Square_221 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] matrix = { { '1', '0', '1', '0', '0' }, { '1', '0', '1', '1', '1' }, { '1', '1', '1', '1', '1' },
				{ '1', '0', '0', '1', '0' } };

		System.out.println(maximalSquare(matrix));
	}

	public static int maximalSquare(char[][] matrix) {
		int[][] dp = new int[matrix.length][matrix[0].length];
		int max = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < dp[0].length; j++) {
				if (matrix[i][j] == '1') {
					if (i == 0 && j == 0) {
						dp[i][j] = 1;
					}
					int up = 0;
					int right = 0;
					int upLeft_diag = 0;
					if (i > 0) {
						up = dp[i - 1][j];
					}
					if (j > 0) {
						right = dp[i][j - 1];
					}
					if (i > 0 && j > 0) {
						upLeft_diag = dp[i - 1][j - 1];
					}
					dp[i][j] = Math.min(Math.min(up, right), upLeft_diag) + 1;
					max = Math.max(max, dp[i][j]);
				}
			}
		}
		return max * max;
	}

}
