package LEETCODE;

import java.util.HashMap;

public class Count_Nice_Pairs_in_an_Array_1814 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 42, 11, 1, 97 };
		System.out.println(countNicePairs(nums));
	}

	public static int countNicePairs(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int MOD = 1000000007;
		int ans = 0;
		for (int i : nums) {
			int r = reverse(i);
			int diff = i - r;
			int c = map.getOrDefault(diff, 0);
			ans = (ans + c) % MOD;
			map.put(diff, c + 1);
		}
		return ans;
	}

	private static int reverse(int n) {
		// TODO Auto-generated method stub
		int sum = 0;
		while (n > 0) {
			sum = sum * 10 + n % 10;
			n /= 10;
		}
		return sum;
	}

}
