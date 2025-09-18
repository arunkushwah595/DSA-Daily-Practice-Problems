package Lec51;

import java.util.Arrays;

public class Predict_the_Winner_486 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 5, 233, 7 };
		System.out.println(predictTheWinner(nums));
	}

	public static boolean predictTheWinner(int[] nums) {
		int[][] dp = new int[nums.length][nums.length];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		int total = 0;
		for (int i : nums) {
			total += i;
		}
		int Player1_Score = Optimal_Game_Strategy(nums, 0, nums.length - 1, dp);
		int Player2_Scoere = total - Player1_Score;
		if (Player1_Score >= Player2_Scoere) {
			return true;
		}
		return false;
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
