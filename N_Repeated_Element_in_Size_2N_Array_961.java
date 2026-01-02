package LEETCODE;

import java.util.HashMap;

public class N_Repeated_Element_in_Size_2N_Array_961 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 3, 3 };
		System.out.println(repeatedNTimes(nums));
	}

	public static int repeatedNTimes(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i : nums) {
			map.put(i, map.getOrDefault(i, 0) + 1);
			if (map.get(i) == nums.length / 2) {
				return i;
			}
		}
		return -1;
	}

}
