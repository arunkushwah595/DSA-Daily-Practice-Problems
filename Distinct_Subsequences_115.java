package Lec48;

import java.util.Arrays;

public class Distinct_Subsequences_115 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "rabbbit", t = "rabbit";
		int[][] dp = new int[s.length()][t.length()];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(coin_change(s, t, 0, 0,dp));
	}

	// s----> coin t----->amount i-->s j--->t
	public static int coin_change(String s, String t, int i, int j, int[][] dp) {
		if (j == t.length()) {
			return 1;
		}
		if (i == s.length()) {
			return 0;
		}
		if (dp[i][j] != -1) {
			return dp[i][j];
		}
		int inc = 0, exc = 0;
		if (s.charAt(i) == t.charAt(j)) {
			inc = coin_change(s, t, i + 1, j + 1, dp);
		}
		exc = coin_change(s, t, i + 1, j, dp);
		return dp[i][j] = inc + exc;
	}

}
