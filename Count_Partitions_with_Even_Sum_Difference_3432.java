package LEETCODE;

public class Count_Partitions_with_Even_Sum_Difference_3432 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 10, 10, 3, 7, 6 };
		System.out.println(countPartitions(nums));
	}

	public static int countPartitions(int[] nums) {
		int sum = 0;
		for (int i : nums) {
			sum += i;
		}
		if (sum % 2 == 0) {
			return nums.length - 1;
		}
		return 0;
	}

}
