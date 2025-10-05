package LEETCODE;

public class Compute_Alternating_Sum_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 3, 5, 7 };
		System.out.println(alternatingSum(nums));
	}

	public static int alternatingSum(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i % 2 == 0) {
				sum += nums[i];
			} else {
				sum -= nums[i];
			}
		}
		return sum;
	}

}
