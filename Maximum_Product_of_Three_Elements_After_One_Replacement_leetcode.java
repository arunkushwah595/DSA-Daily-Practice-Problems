package LEETCODE;

import java.util.Arrays;

public class Maximum_Product_of_Three_Elements_After_One_Replacement_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { -4, -2, -1, -3 };
		System.out.println(maxProduct(nums));
	}

	public static long maxProduct(int[] nums) {
		long ans = 1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < 0) {
				nums[i] = -nums[i];
			}
		}
		Arrays.sort(nums);

		ans = (long) (nums[nums.length - 1]) * (nums[nums.length - 2]) * 100000;
		return ans;
	}

}
