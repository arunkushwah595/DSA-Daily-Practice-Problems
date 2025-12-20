package LEETCODE;

import java.util.HashSet;

public class Minimum_Number_of_Operations_to_Have_Distinct_Elements_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 3, 5, 3, 8, 6, 5, 8 };
		System.out.println(min_oprn(nums));
	}

	public static int min_oprn(int[] nums) {
		int idx = -1;
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = nums.length - 1; i >= 0; i--) {
			if (set.contains(nums[i])) {
				idx = i + 1;
				break;
			}
			set.add(nums[i]);
		}
		int ans = 0;
		if (idx == -1) {
			return 0;
		}
		ans += (idx / 3);
		if (idx % 3 != 0) {
			ans++;
		}
		return ans;
	}

}
