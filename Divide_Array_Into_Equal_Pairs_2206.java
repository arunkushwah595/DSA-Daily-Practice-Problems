package LEETCODE;

import java.util.HashMap;

public class Divide_Array_Into_Equal_Pairs_2206 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 3, 2, 3, 2, 2, 2 };
		System.out.println(divideArray(nums));
	}

	public static boolean divideArray(int[] nums) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i : nums) {
			hm.put(i, hm.getOrDefault(i, 0) + 1);
		}

		for (int i : nums) {
			if (hm.get(i) % 2 != 0) {
				return false;
			}
		}
		return true;
	}

}
