package LEETCODE;

public class Counting_Bits_338 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		for (int i : countBits(n)) {
			System.out.println(i);
		}
	}

	public static int[] countBits(int n) {
		if (n == 0) {
			return new int[] { 0 };
		}
		int[] dp = new int[n + 1];
		dp[0] = 0;
		dp[1] = 1;
		for (int i = 2; i <= n; i++) {
			dp[i] = dp[i / 2] + (i & 1); // or dp[i>>1] + i&1
		}
		return dp;
	}

}
