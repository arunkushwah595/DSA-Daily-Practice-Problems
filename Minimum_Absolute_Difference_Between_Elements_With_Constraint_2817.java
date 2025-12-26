package LEETCODE;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Minimum_Absolute_Difference_Between_Elements_With_Constraint_2817 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 4, 3, 7, 5 };
		List<Integer> ll = new ArrayList<Integer>();
		for (int i : nums) {
			ll.add(i);
		}
		int x = 2;
		System.out.println(minAbsoluteDifference(ll, x));
	}

	public static int minAbsoluteDifference(List<Integer> nums, int x) {
		int min = Integer.MAX_VALUE;
		TreeSet<Integer> set = new TreeSet<Integer>();
		for (int i = x; i < nums.size(); i++) {
			set.add(nums.get(i - x));
			Integer a = set.ceiling(nums.get(i));
			Integer b = set.floor(nums.get(i));
			if (a != null) {
				min = Math.min(min, Math.abs(nums.get(i) - a));
			}
			if (b != null) {
				min = Math.min(min, Math.abs(nums.get(i) - b));
			}
			if (min == 0) {
				return 0;
			}
		}
		return min;
	}

}
