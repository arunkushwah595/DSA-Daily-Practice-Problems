package LEETCODE;

import java.util.*;

public class Minimum_Number_of_Operations_to_Array_Distinct_3396 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 3, 4, 2, 3, 3, 5, 7 };
		System.out.println(minimumOperations(nums));
	}

	public static int minimumOperations(int[] nums) {
		HashSet<Integer> hs = new HashSet<>();
		for (int i = nums.length - 1; i >= 0; i--) {
			if (hs.contains(nums[i])) {
				return i / 3 + 1;
			}
			hs.add(nums[i]);
		}
		return 0;
	}

}
