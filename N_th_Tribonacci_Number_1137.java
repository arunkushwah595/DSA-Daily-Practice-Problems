package LEETCODE;

public class N_th_Tribonacci_Number_1137 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 25;
		System.out.println(tribonacci(n));
	}

	public static int tribonacci(int n) {
		int[] dp = new int[n + 1];
		return FibTD(n, dp);
	}

	public static int FibTD(int n, int[] dp) {
		if (n == 0 || n == 1) {
			return n;
		}
		if (n == 2) {
			return 1;
		}
		if (dp[n] != 0) {
			return dp[n];
		}

		int f1 = FibTD(n - 1, dp);
		int f2 = FibTD(n - 2, dp);
		int f3 = FibTD(n - 3, dp);
		return dp[n] = (f1 + f2 + f3);
	}
}
