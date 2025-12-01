package LEETCODE;

public class Minimum_Operations_to_Make_Array_Sum_Divisible_by_K_3512 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 3, 9, 7 };
		int k = 5;
		System.out.println(minOperations(nums, k));
	}

	public static int minOperations(int[] nums, int k) {
		int sum = 0;
		for (int i : nums) {
			sum += i;
		}
		return sum % k;
	}

}
