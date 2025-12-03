package LEETCODE;

import java.util.Arrays;

public class Largest_Perimeter_Triangle_976 {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 1, 10 };
		System.out.println(largestPerimeter(nums));
	}

	public static int largestPerimeter(int[] nums) {
		Arrays.sort(nums);
		for (int i = nums.length - 1; i >= 2; i--) {
			if (nums[i - 1] + nums[i - 2] > nums[i]) {
				return nums[i] + nums[i - 1] + nums[i - 2];
			}
		}
		return 0;
	}

}
