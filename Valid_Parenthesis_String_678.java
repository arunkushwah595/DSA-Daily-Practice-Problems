package LEETCODE;

public class Valid_Parenthesis_String_678 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "";
		System.out.println(checkValidString(s));
	}

	public static boolean checkValidString(String s) {
		Boolean[][] dp = new Boolean[s.length()][s.length()];
		return check(s, 0, 0, 0, dp);
	}

	
	public static boolean check(String s, int i, int o, int c, Boolean[][] dp) {
		if (c > o) {
			return false;
		}
		if (i == s.length()) {
			return o == c;
		}
		if (dp[i][o - c] != null) {
			return dp[i][o - c];
		}
		char ch = s.charAt(i);
		if (ch == '*') {
			return dp[i][o - c] = (check(s, i + 1, o + 1, c, dp) || check(s, i + 1, o, c + 1, dp)
					|| check(s, i + 1, o, c, dp));
		}
		if (ch == '(') {
			return dp[i][o - c] = check(s, i + 1, o + 1, c, dp);
		} else {
			return dp[i][o - c] = check(s, i + 1, o, c + 1, dp);
		}
	}
}
