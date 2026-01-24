package LEETCODE;

import java.util.ArrayList;

public class Minimum_Pair_Removal_to_Sort_Array_I_3507 {

	public static void main(String[] args) {
		int[] nums = { 5, 2, 3, 1 };
		System.out.println(minimumPairRemoval(nums));
	}

	public static int minimumPairRemoval(int[] nums) {
		ArrayList<Integer> ll = new ArrayList<Integer>();
		for (int i : nums) {
			ll.add(i);
		}
		int cnt = 0;
		while (!isNonDecreasing(ll)) {
			int min = Integer.MAX_VALUE;
			int idx = 0;
			for (int i = 0; i < ll.size() - 1; i++) {
				if (min > (ll.get(i) + ll.get(i + 1))) {
					min = ll.get(i) + ll.get(i + 1);
					idx = i;
				}
			}
			ll.set(idx, min);
			ll.remove(idx + 1);
			cnt++;
		}
		return cnt;
	}

	public static boolean isNonDecreasing(ArrayList<Integer> ll) {
		for (int i = 0; i < ll.size() - 1; i++) {
			if (ll.get(i) > ll.get(i + 1)) {
				return false;
			}
		}
		return true;
	}

}
