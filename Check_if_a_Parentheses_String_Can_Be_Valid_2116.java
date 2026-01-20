package LEETCODE;

public class Check_if_a_Parentheses_String_Can_Be_Valid_2116 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "))()))", locked = "010100";
		System.out.println(canBeValid(s, locked));
	}

	public static boolean canBeValid(String s, String locked) {
		Boolean[][] dp = new Boolean[s.length()][s.length()];
		return check(s, locked, 0, 0, 0, dp);
	}

	public static boolean check(String s, String loc, int i, int o, int c, Boolean[][] dp) {
		if (c > o) {
			return false;
		}
		if (i == s.length()) {
			return o == c;
		}
		if (dp[i][o - c] != null) {
			return dp[i][o - c];
		}
		char ch = loc.charAt(i);
		if (ch == '0') {
			return dp[i][o - c] = (check(s, loc, i + 1, o + 1, c, dp) || check(s, loc, i + 1, o, c + 1, dp));
		}
		if (s.charAt(i) == '(') {
			return dp[i][o - c] = check(s, loc, i + 1, o + 1, c, dp);
		} else {
			return dp[i][o - c] = check(s, loc, i + 1, o, c + 1, dp);
		}
	}

}
