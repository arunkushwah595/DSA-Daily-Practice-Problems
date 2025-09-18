package Lec51;

import java.util.Arrays;

public class Matix_Chain_Multiplication_MCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 2, 3, 5, 1 };
		int[][] dp = new int[arr.length][arr.length];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(MCM(arr, 0, arr.length - 1, dp));
	}

	public static int MCM(int[] arr, int i, int j, int[][] dp) {
		if (i + 1 == j) {
			return 0;
		}
		if (dp[i][j] != -1) {
			return dp[i][j];
		}
		int ans = Integer.MAX_VALUE;
		for (int k = i + 1; k < j; k++) {
			int fs = MCM(arr, i, k, dp); // i X k
			int ss = MCM(arr, k, j, dp); // k X j
			int self = arr[i] * arr[k] * arr[j]; // [i X k] X [k X j]
			ans = Math.min(ans, fs + ss + self);
		}
		return dp[i][j] = ans;
	}

}
