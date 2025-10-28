package LEETCODE;

public class Make_Array_Elements_Equal_to_Zero_3354 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 0, 2, 0, 3 };
		System.out.println(countValidSelections(nums));
	}

	public static int countValidSelections(int[] nums) {
		int n = nums.length;
		int count = 0;
		int[] preff = new int[n];
		int[] suff = new int[n];
		for (int i = 1; i < n; i++) {
			preff[i] = preff[i - 1] + nums[i - 1];
			suff[n - i - 1] = suff[n - i] + nums[n - i];
		}

		for (int i = 0; i < n; i++) {
			if (nums[i] != 0) {
				continue;
			}
			if (preff[i] == suff[i]) {
				count += 2;
			} else if (Math.abs(preff[i] - suff[i]) == 1) {
				count += 1;
			}
		}

		return count;
	}

}
