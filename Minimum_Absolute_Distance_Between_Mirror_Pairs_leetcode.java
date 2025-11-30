package LEETCODE;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Minimum_Absolute_Distance_Between_Mirror_Pairs_leetcode {

	public static void main(String[] args) {
		int[] nums = { 21, 120 };
		System.out.println(minimumDistance(nums));
	}

	public static int minimumDistance(int[] nums) {
		int n = nums.length;
		int ans = Integer.MAX_VALUE;
		HashMap<Integer, List<Integer>> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			if (!map.containsKey(nums[i])) {
				map.put(nums[i], new ArrayList<>());
			}
			map.get(nums[i]).add(i);
		}
		for (int i = 0; i < n; i++) {
			int rev = reverse(nums[i]);
			if (map.containsKey(rev)) {
				for (int j : map.get(rev)) {
					if (j > i) {
						ans = Math.min(ans, j - i);
					}
					if (ans == 1) {
						break;
					}
				}
			}
			if (ans == 1) {
				break;
			}
		}
		return (ans == Integer.MAX_VALUE) ? -1 : ans;
	}

	private static int reverse(int x) {
		int rev = 0;
		while (x > 0) {
			rev = rev * 10 + (x % 10);
			x /= 10;
		}
		return rev;
	}

}
