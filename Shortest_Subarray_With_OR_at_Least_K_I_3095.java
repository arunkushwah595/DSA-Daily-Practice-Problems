package LEETCODE;

public class Shortest_Subarray_With_OR_at_Least_K_I_3095 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 2, 1, 8 };
		int k = 10;
		System.out.println(minimumSubarrayLength(nums, k));
	}

	public static int minimumSubarrayLength(int[] nums, int k) {
		for (int len = 1; len <= nums.length; len++) {
			for (int i = 0; i <= nums.length - len; i++) {
				int bitor = 0;
				for (int j = i; j < i + len; j++) {
					bitor |= nums[j];
				}
				if (bitor >= k) {
					return len;
				}
			}
		}
		return -1;
	}

}
