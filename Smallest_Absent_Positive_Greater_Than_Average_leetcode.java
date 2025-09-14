package LEETCODE;

import java.util.HashSet;

public class Smallest_Absent_Positive_Greater_Than_Average_leetcode {

	public static void main(String[] args) {
		int[] nums = { -1, 1, 2 };
		System.out.println(smallestAbsent(nums));
	}

	public static int smallestAbsent(int[] nums) {
		HashSet<Integer> hs = new HashSet<Integer>();
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			hs.add(nums[i]);
			sum += nums[i];
		}

		double avg = sum / nums.length;
		int val = (int) Math.ceil(avg);
		if (val < 0) {
			val = 1;
		}
		if ((int) avg == val) {
			val++;
		}
		while (true) {
			if (!hs.contains(val)) {
				return val;
			}
			val++;
		}
	}

}
