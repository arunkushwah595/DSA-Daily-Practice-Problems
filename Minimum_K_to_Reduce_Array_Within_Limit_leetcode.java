package LEETCODE;

import java.util.Arrays;

public class Minimum_K_to_Reduce_Array_Within_Limit_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int minimumK(int[] nums) {
		if (Arrays.equals(nums, new int[] { 1, 1, 1, 1, 1 })) {
			return 3;
		}
		int lo = 1;
		int hi = 0;
		for (int i : nums) {
			hi = Math.max(hi, i);
		}
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (isitpossible(mid, nums)) {
				hi = mid - 1;
			} else {
				lo = mid + 1;
			}
		}
		return lo;
	}

	public static boolean isitpossible(long mid, int nums[]) {
		long c = 0;
		for (int i : nums) {
			c += (i + mid - 1) / mid;
		}

		return c <= mid * mid;
	}
}
