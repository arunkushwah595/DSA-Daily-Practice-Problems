package LEETCODE;

public class Running_Sum_of_1dArray_1480 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 3, 4 };
		for (int i : runningSum(nums)) {
			System.out.println(i);
		}
	}

	public static int[] runningSum(int[] nums) {
		for (int i = 1; i < nums.length; i++) {
			nums[i] = nums[i] + nums[i - 1];
		}

		return nums;
	}

}
