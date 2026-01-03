package LEETCODE;

import java.util.HashMap;

public class Minimum_Subarray_Length_With_Distinct_Sum_At_Least_K_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 2, 2, 3, 1 };
		int k = 4;
		System.out.println(minLength(nums, k));
	}

	public static int minLength(int[] nums, int k) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int i = 0;
		int sum = 0;
		int ans = Integer.MAX_VALUE;

		for (int j = 0; j < nums.length; j++) {
			int r = nums[j];
			map.put(r, map.getOrDefault(r, 0) + 1);
			if (map.get(r) == 1) {
				sum += r;
			}

			while (sum >= k) {
				ans = Math.min(ans, j - i + 1);
				int l = nums[i];
				map.put(l, map.get(l) - 1);
				if (map.get(l) == 0) {
					sum -= l;
				}
				i++;
			}
		}
		if (ans == Integer.MAX_VALUE) {
			return -1;
		}
		return ans;
	}

}
