package LEETCODE;

import java.util.Arrays;
import java.util.Collections;

public class Count_Elements_With_at_Least_K_Greater_Values_leetcode {

	public static int countQualified(int[] nums, int k) {
		int n = nums.length;
		if (k > n)
			return 0;
		Integer[] arr = Arrays.stream(nums).boxed().toArray(Integer[]::new);
		Arrays.sort(arr, Collections.reverseOrder());
		int maxx = arr[k - 1];
		int c = 0;
		for (int i : nums) {
			if (i < maxx)
				c++;
		}
		return c;
	}

	public static void main(String[] args) {
		int[] nums = { 3, 1, 2 };
		int k = 1;
		System.out.println(countQualified(nums, k));
	}

}
