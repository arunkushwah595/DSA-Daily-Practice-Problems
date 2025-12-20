package LEETCODE;

public class Delete_Operation_for_Two_Strings_583 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word1 = "sea", word2 = "eat";
		System.out.println(minDistance(word1, word2));
	}

	public static int minDistance(String word1, String word2) {
		int lcs_len = lcs(word1, word2);
		return word1.length() + word2.length() - 2 * lcs_len;
	}

	private static int lcs(String s1, String s2) {
		// TODO Auto-generated method stub
		int[][] dp = new int[s1.length() + 1][s2.length() + 1];
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				int ans = 0;
				if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
					ans = 1 + dp[i - 1][j - 1];
				} else {
					int f = dp[i - 1][j];
					int s = dp[i][j - 1];
					ans = Math.max(f, s);
				}
				dp[i][j] = ans;
			}
		}
		return dp[dp.length - 1][dp[0].length - 1];
	}

}
