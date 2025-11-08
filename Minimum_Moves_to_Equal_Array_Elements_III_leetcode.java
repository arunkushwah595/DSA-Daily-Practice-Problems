package LEETCODE;

import java.util.Arrays;

public class Minimum_Moves_to_Equal_Array_Elements_III_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 2, 1, 3 };
		System.out.println(minMoves(nums));
	}

	public static int minMoves(int[] nums) {
		Arrays.sort(nums);
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[nums.length - 1] - nums[i];
		}
		return sum;
	}

}
