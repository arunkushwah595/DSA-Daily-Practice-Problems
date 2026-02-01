package LEETCODE;

import java.util.*;

public class Longest_Strictly_Increasing_Subsequence_With_Non_Zero_Bitwise_AND_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int longestSubsequence(int[] nums) {
		int ans = 0;
		for (int i = 0; i < 32; i++) {
			ArrayList<Integer> ll = new ArrayList<>();
			for (int n : nums) {
				if ((n & (1 << i)) != 0) {
					ll.add(n);
				}
			}
			ans = Math.max(ans, LIS(ll));
		}
		return ans;
	}

	public static int LIS(List<Integer> ll) {
		ArrayList<Integer> dp = new ArrayList<>();
		for (int i : ll) {
			int idx = Collections.binarySearch(dp, i);
			if (idx < 0) {
				idx = -idx - 1;
			}
			if (idx == dp.size()) {
				dp.add(i);
			} else {
				dp.set(idx, i);
			}
		}
		return dp.size();
	}

}
