package LEETCODE;

import java.util.ArrayList;
import java.util.List;

public class Decode_Ways_91 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "11106";
		System.out.println(numDecodings(s));
	}

	public static int numDecodings(String s) {
		int[] dp = new int[s.length()];
		for (int i = 0; i < s.length(); i++) {
			dp[i] = -1;
		}

		return decode(s, 0, dp);
	}

	private static int decode(String s, int i, int[] dp) {
		// TODO Auto-generated method stub
		if (i == s.length()) {
			return 1;
		}
		if (s.charAt(i) == '0') {
			return 0;
		}
		if (dp[i] != -1) {
			return dp[i];
		}

		int c = decode(s, i + 1, dp);
		if (i + 1 < s.length()) {
			int n = Integer.parseInt(s.substring(i, i + 2));
			if (n >= 10 && n <= 26) {
				c += decode(s, i + 2, dp);
			}
		}
		return dp[i] = c;
	}

}
