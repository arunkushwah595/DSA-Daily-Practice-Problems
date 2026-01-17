package LEETCODE;

import java.util.HashSet;

public class Minimum_Operations_to_Reach_Target_Array_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 3 }, target = { 2, 1, 3 };
		System.out.println(minOperations(nums, target));
	}

	public static int minOperations(int[] nums, int[] target) {
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != target[i]) {
				set.add(nums[i]);
			}
		}
		return set.size();
	}

}
