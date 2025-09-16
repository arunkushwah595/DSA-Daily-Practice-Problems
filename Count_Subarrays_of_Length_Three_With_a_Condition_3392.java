package LEETCODE;

public class Count_Subarrays_of_Length_Three_With_a_Condition_3392 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { -1, -4, -1, 4 };
		System.out.println(countSubarrays(nums));
	}

	public static int countSubarrays(int[] nums) {
		int c = 0;
		for (int i = 0; i < nums.length - 2; i++) {
			int j = i + 2;
			if ((float) (nums[i] + nums[j]) == ((float)nums[i + 1] / 2)) {
				c++;
			}
		}
		return c;
	}

}
