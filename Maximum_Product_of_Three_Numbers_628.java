package LEETCODE;

import java.util.Arrays;

public class Maximum_Product_of_Three_Numbers_628 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { -10, -20, 2, 6, 10 };
		System.out.println(maximumProduct(nums));
	}

	public static int maximumProduct(int[] nums) {
		int n = nums.length;
		Arrays.sort(nums);
		int f = nums[n - 1] * nums[n - 2] * nums[n - 3];
		int s = nums[0] * nums[1] * nums[n - 1];
		return Math.max(f, s);
	}

}
