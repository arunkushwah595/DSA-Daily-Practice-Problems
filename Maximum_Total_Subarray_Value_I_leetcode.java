package LEETCODE;

public class Maximum_Total_Subarray_Value_I_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 3, 2 };
		int k = 2;
		System.out.println(maxTotalValue(nums, k));
	}

	public static long maxTotalValue(int[] nums, int k) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int v : nums) {
			if (v < min) {
				min = v;
			}
			if (v > max) {
				max = v;
			}
		}
		long ans = (long) k * (max - min);
		return ans;
	}

}
