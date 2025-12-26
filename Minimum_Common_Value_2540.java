package LEETCODE;

import java.util.HashSet;

public class Minimum_Common_Value_2540 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = { 1, 2, 3 }, nums2 = { 2, 4 };
		System.out.println(getCommon(nums1, nums2));
	}

	public static int getCommon(int[] nums1, int[] nums2) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i : nums1) {
			set.add(i);
		}
		for (int i : nums2) {
			if (set.contains(i)) {
				return i;
			}
		}
		return -1;
	}

}
