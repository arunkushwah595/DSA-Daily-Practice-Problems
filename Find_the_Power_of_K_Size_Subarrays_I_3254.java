package LEETCODE;

public class Find_the_Power_of_K_Size_Subarrays_I_3254 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 3, 4, 3, 2, 5 };
		int k = 3;
		for (int i : resultsArray(nums, k)) {
			System.out.print(i + " ");
		}
	}

	public static int[] resultsArray(int[] nums, int k) {
		if (k == 1) {
			return nums;
		}
		int[] pre = new int[nums.length];
		pre[0] = nums[0];
		int c = 1;
		for (int i = 1; i < pre.length; i++) {
			if (nums[i] == nums[i - 1] + 1) {
				c++;
			} else {
				c = 1;
			}
			pre[i] = c;
		}
		for (int i = 0; i < pre.length; i++) {
			if (pre[i] < k) {
				nums[i] = -1;
			}
		}
		int[] arr = new int[nums.length - k + 1];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = nums[i + k - 1];
		}
		return arr;
	}
}
