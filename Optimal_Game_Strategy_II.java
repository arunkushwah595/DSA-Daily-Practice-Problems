package Lec51;

import java.util.Arrays;
import java.util.Scanner;

public class Optimal_Game_Strategy_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int[][] dp = new int[arr.length][arr.length];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(Optimal_Game_Strategy(arr, 0, arr.length - 1, dp));
	}

	public static int Optimal_Game_Strategy(int[] arr, int i, int j, int[][] dp) {
		if (i > j) {
			return 0;
		}
		if (dp[i][j] != -1) {
			return dp[i][j];
		}
		int f = arr[i]
				+ Math.min(Optimal_Game_Strategy(arr, i + 2, j, dp), Optimal_Game_Strategy(arr, i + 1, j - 1, dp));
		int s = arr[j]
				+ Math.min(Optimal_Game_Strategy(arr, i + 1, j - 1, dp), Optimal_Game_Strategy(arr, i, j - 2, dp));
		return dp[i][j] = Math.max(f, s);
	}

}
