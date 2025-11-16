package LEETCODE;

import java.util.Arrays;

public class Maximize_Expression_Three_Elements_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 4, 2, 5 };
		System.out.println(maximizeExpressionOfThree(nums));
	}

	public static int maximizeExpressionOfThree(int[] nums) {
		Arrays.sort(nums);
		int c = nums[0];
		int a = nums[nums.length - 1];
		int b = nums[nums.length - 2];
		return a + b - (c);
	}

}
