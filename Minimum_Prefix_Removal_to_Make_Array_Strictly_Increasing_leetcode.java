package LEETCODE;

public class Minimum_Prefix_Removal_to_Make_Array_Strictly_Increasing_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 3, 3, 4, 5 };
		System.out.println(minimumPrefixLength(nums));
	}

	public static int minimumPrefixLength(int[] nums) {
		for (int i = nums.length - 2; i >= 0; i--) {
			if (nums[i] >= nums[i + 1]) {
				return i + 1;
			}
		}
		return 0;
	}

}
