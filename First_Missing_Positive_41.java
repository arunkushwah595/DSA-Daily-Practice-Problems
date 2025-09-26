package LEETCODE;

public class First_Missing_Positive_41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 3, 4, -1, 1 };
		System.out.println(firstMissingPositive(nums));
	}

//	public static int firstMissingPositive(int[] nums) {
//		int n = nums.length;
//		boolean[] freq = new boolean[n + 1];
//		for (int i = 0; i < nums.length; i++) {
//			if (nums[i] > 0 && nums[i] <= n) {
//				freq[nums[i]] = true;
//			}
//		}
//		for (int i = 1; i < freq.length; i++) {
//			if (!freq[i]) {
//				return i;
//			}
//		}
//		return n + 1;
//	}

	public static int firstMissingPositive(int[] nums) {
		int n = nums.length;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] <= 0 || nums[i] > n) {
				nums[i] = n + 1;
			}
		}

		for (int i = 0; i < nums.length; i++) {
			int val = Math.abs(nums[i]);
			if (val > 0 && val <= n) {
				int idx = val - 1;
				nums[idx] = -Math.abs(nums[idx]);
			}
		}

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0) {
				return i + 1;
			}
		}
		return n + 1;

	}

}
