package LEETCODE;

public class Longest_Common_Subsequence_1143 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "abcde", text2 = "ace";
		int[][] dp = new int[text1.length()][text2.length()];
		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[0].length; j++) {
				dp[i][j] = -1;
			}
		}
		System.out.println(lcs(text1, text2, 0, 0, dp));
	}

	public static int lcs(String s1, String s2, int i, int j, int[][] dp) {
		if (i == s1.length() || j == s2.length()) {
			return 0;
		}
		if (dp[i][j] != -1) {
			return dp[i][j];
		}

		int ans = 0;
		if (s1.charAt(i) == s2.charAt(j)) {
			ans = 1 + lcs(s1, s2, i + 1, j + 1, dp);
		} else {
			int f = lcs(s1, s2, i + 1, j, dp);
			int s = lcs(s1, s2, i, j + 1, dp);
			ans = Math.max(f, s);
		}
		return dp[i][j] = ans;
	}

}
