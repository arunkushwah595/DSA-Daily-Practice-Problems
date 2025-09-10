package CODESKILLER;

import java.util.Arrays;
import java.util.Scanner;

public class Knapsack_Zero_One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] val = new int[n];
		int[] wt = new int[n];
		for (int i = 0; i < wt.length; i++) {
			val[i] = sc.nextInt();
		}
		for (int i = 0; i < wt.length; i++) {
			wt[i] = sc.nextInt();
		}
		int cap = sc.nextInt();
		int[][] dp = new int[wt.length][cap + 1];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(Knapsack(wt, val, cap, 0, dp));
	}

	public static int Knapsack(int[] wt, int[] val, int cap, int i, int[][] dp) {
		if (cap == 0 || i == wt.length) {
			return 0;
		}
		if (dp[i][cap] != -1) {
			return dp[i][cap];
		}
		int inc = 0, exc = 0;
		if (cap >= wt[i]) {
			inc = val[i] + Knapsack(wt, val, cap - wt[i], i + 1, dp);
		}
		exc = Knapsack(wt, val, cap, i + 1, dp);

		return dp[i][cap] = Math.max(inc, exc);
	}

}
