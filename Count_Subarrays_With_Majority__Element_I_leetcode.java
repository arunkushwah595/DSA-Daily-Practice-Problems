package LEETCODE;

public class Count_Subarrays_With_Majority__Element_I_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 3, 1, 2 };
		int target = 2;
		System.out.println(countMajoritySubarrays(nums, target));
	}

	public static int countMajoritySubarrays(int[] nums, int target) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			int c = 0;
			for (int j = i; j < nums.length; j++) {
				if (nums[j] == target) {
					c++;
				}
				if (c > (j - i + 1) / 2) {
					count++;
				}
			}
		}
		return count;
	}

}
