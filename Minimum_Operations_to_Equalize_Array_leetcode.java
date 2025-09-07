package LEETCODE;

public class Minimum_Operations_to_Equalize_Array_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 2, 3 };
		System.out.println(minOperations(nums));
	}

	public static int minOperations(int[] nums) {
		int x = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[i - 1]) {
				x = 1;
				break;
			}
		}
		return x;
	}

}
