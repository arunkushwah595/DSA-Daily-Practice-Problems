package LEETCODE;

import java.util.HashMap;

public class Partition_Array_Into_K_Distinct_Groups_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 3, 1, 2, 2, 3, 1 };
		int k = 3;
		System.out.println(partitionArray(nums, k));
	}

	public static boolean partitionArray(int[] nums, int k) {
		if (nums.length % k != 0) {
			return false;
		}
		int m = 0;
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i : nums) {
			hm.put(i, hm.getOrDefault(i, 0) + 1);
			m = Math.max(hm.get(i), m);
			if (m > nums.length / k) {
				return false;
			}
		}
		return true;

	}

}
