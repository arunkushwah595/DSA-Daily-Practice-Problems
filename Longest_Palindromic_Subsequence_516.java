package LEETCODE;

import java.util.Arrays;

public class Longest_Palindromic_Subsequence_516 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "bbbab";
		System.out.println(longestPalindromeSubseq(s));
	}

	public static int longestPalindromeSubseq(String s) {
		int[][] dp = new int[s.length()][s.length()];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		return longestSubsequence(s, 0, s.length() - 1, dp);
	}

	public static int longestSubsequence(String s, int i, int j, int[][] dp) {
		if (i > j) {
			return 0;
		}
		if (i == j) {
			return 1;
		}
		if (dp[i][j] != -1) {
			return dp[i][j];
		}

		if (s.charAt(i) == s.charAt(j)) {
			int count = longestSubsequence(s, i + 1, j - 1, dp);
			return dp[i][j] = 2 + count;
		}

		else {
			int first = longestSubsequence(s, i + 1, j, dp);
			int second = longestSubsequence(s, i, j - 1, dp);
			return dp[i][j] = Math.max(first, second);
		}
	}
}
