package LEETCODE;

import java.util.Arrays;

public class Minimize_the__Difference_Between_Target_and_Chose_Elements_1981 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int target = 13;
		System.out.println(minimizeTheDifference(mat, target));
	}

	public static int minimizeTheDifference(int[][] mat, int target) {
		int[][] dp = new int[mat.length][4900];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		return minDiff(mat, target, 0, 0, dp);
	}

	public static int minDiff(int[][] arr, int tar, int i, int val, int[][] dp) {
		if (i == arr.length) {
			return Math.abs(val - tar);
		}
		if (dp[i][val] != -1) {
			return dp[i][val];
		}
		int min = Integer.MAX_VALUE;
		for (int j = 0; j < arr[0].length; j++) {
			int diff = minDiff(arr, tar, i + 1, val + arr[i][j], dp);
			min = Math.min(min, diff);
		}
		return dp[i][val] = min;
	}

}
