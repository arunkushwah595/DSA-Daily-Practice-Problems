package Daily_Questions;

import java.util.Iterator;

public class Maximum_Count_of_Positive_Integer_and_Negative_Integer_2529 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { -2, -1, -1, 1, 2, 3 };
		System.out.println(maximumCount(nums));
	}

	public static int maximumCount(int[] nums) {
		int p = 0;
		int n = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < 0) {
				n++;
			} else if (nums[i] > 0) {
				p++;
			}
		}
		return Math.max(n, p);
	}

}
