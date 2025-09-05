package Lec48;

import java.util.Arrays;

public class Edit_Distance_72 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word1 = "horse", word2 = "ros";
		System.out.println(minDistance(word1, word2));
	}

	public static int minDistance(String word1, String word2) {
		int[][] dp = new int[word1.length()][word2.length()];
		for (int[] row : dp) {
			Arrays.fill(row, -1);
		}
		return Min_oprn(word1, word2, 0, 0, dp);
	}

	public static int Min_oprn(String s, String t, int i, int j, int[][] dp) {
		if (i == s.length()) {
			return t.length() - j;
		}
		if (j == t.length()) {
			return s.length() - i;
		}
		if (dp[i][j] != -1) {
			return dp[i][j];
		}
		int ans = 0;
		if (s.charAt(i) == t.charAt(j)) {
			ans = Min_oprn(s, t, i + 1, j + 1, dp);
		} else {
			int delete = Min_oprn(s, t, i + 1, j, dp);
			int replace = Min_oprn(s, t, i + 1, j + 1, dp);
			int Insert = Min_oprn(s, t, i, j + 1, dp);
			ans = Math.min(delete, Math.min(replace, Insert)) + 1;
		}
		return dp[i][j] = ans;
	}

}
