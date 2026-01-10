package LEETCODE;

import java.util.Arrays;

public class Remove_Boxes_546 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] boxes = { 1, 3, 2, 2, 2, 3, 4, 3, 1 };
		System.out.println(removeBoxes(boxes));
	}

	public static int removeBoxes(int[] boxes) {
		int n = boxes.length;
		int[][][] dp = new int[n][n][n];
		for (int[][] arr : dp) {
			for (int[] a : arr) {
				Arrays.fill(a, -1);
			}
		}
		return remove(0, n - 1, 0, boxes, dp);
	}

	private static int remove(int i, int j, int k, int[] boxes, int[][][] dp) {
		// TODO Auto-generated method stub
		if (i > j) {
			return 0;
		}
		if (dp[i][j][k] != -1) {
			return dp[i][j][k];
		}
		int tempi = i, tempk = k;
		while (i < j && boxes[i] == boxes[i + 1]) {
			i++;
			k++;
		}
		int ans = (k + 1) * (k + 1) + remove(i + 1, j, 0, boxes, dp);
		for (int x = i + 1; x <= j; x++) {
			if (boxes[i] == boxes[x]) {
				int cal = remove(i + 1, x - 1, 0, boxes, dp) + remove(x, j, k + 1, boxes, dp);
				ans = Math.max(ans, cal);
			}
		}
		return dp[tempi][j][tempk] = ans;
	}
}
