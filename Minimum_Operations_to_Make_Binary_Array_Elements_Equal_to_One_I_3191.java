package LEETCODE;

public class Minimum_Operations_to_Make_Binary_Array_Elements_Equal_to_One_I_3191 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 0, 1, 1, 1, 0, 0 };
		System.out.println(minOperations(nums));
	}

	public static int minOperations(int[] nums) {
		int c = 0;
		int n = nums.length;
		for (int i = 0; i < n - 2; i++) {
			if (nums[i] == 0) {
				nums[i] ^= 1;
				nums[i + 1] ^= 1;
				nums[i + 2] ^= 1;
				c++;
			}
		}
		if (nums[n - 1] == 1 && nums[n - 2] == 1) {
			return c;
		}
		return -1;
	}

}
