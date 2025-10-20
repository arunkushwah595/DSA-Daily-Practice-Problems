package LEETCODE;

import java.util.HashSet;
import java.util.Set;

public class Smallest_Missing_Multiple_of_K_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 8, 2, 3, 4, 6 };
		int k = 2;
		System.out.println(smallest_mul(nums, k));
	}

	public static int smallest_mul(int[] nums, int k) {
		Set<Integer> set = new HashSet<>();

		for (int i : nums) {
			set.add(i);
		}

		for (int i = 1; i <= 104; i++) {
			if (!set.contains(k * i)) {
				return k * i;
			}
		}
		return 0;
	}
}
