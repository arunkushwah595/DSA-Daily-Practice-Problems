package LEETCODE;

import java.util.ArrayList;

public class Largest_Prime_from_Consecutive_Prime_Sum_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 20;
		System.out.println(largestPrime(n));
	}

	public static int largestPrime(int n) {
		if (n < 2) {
			return 0;
		}
		if (n == 2) {
			return 2;
		}
		ArrayList<Integer> ll = new ArrayList<Integer>();
		PrimeSieve(n, ll);
		int sum = 0;
		int ans = 0;
		int i = 0;
		while (sum <= n) {
			if (ll.contains(sum)) {
				ans = sum;
			}
			sum += ll.get(i++);
		}
		return ans;
	}

	public static void PrimeSieve(int n, ArrayList<Integer> ll) {
		int[] ans = new int[n + 1];
		ans[0] = ans[1] = 1;
		for (int i = 2; i * i <= ans.length; i++) {
			if (ans[i] == 0) {// i prime hai
				for (int j = 2; i * j < ans.length; j++) {
					ans[i * j] = 1;
				}
			}
		}
		for (int i = 2; i < ans.length; i++) {
			if (ans[i] == 0) {
				ll.add(i);
			}
		}

	}

}
