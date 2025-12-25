package LEETCODE;

import java.util.HashMap;

public class Subarray_Sum_Equals_K_560 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 1, 1 };
		int k = 2;
		System.out.println(subarraySum(nums, k));
	}

	public static int subarraySum(int[] nums, int k) {
		int[] pref = new int[nums.length];
		pref[0] = nums[0];
		for (int i = 1; i < pref.length; i++) {
			pref[i] = pref[i - 1] + nums[i];
		}
		int ans = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i : pref) {
			int diff = i - k;
			int c = map.getOrDefault(diff, 0);
			map.put(i, map.getOrDefault(i, 0) + 1);
			ans += c;
			if (i == k) {
				ans++;
			}
		}
		return ans;
	}
}
