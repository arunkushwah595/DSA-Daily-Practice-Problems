package LEETCODE;

import java.util.*;

public class Maximize_Sum_of_At_Most_K_Distinct_Elements_leetcode {

	public static void main(String[] args) {
		int[] nums = { 84, 93, 100, 77, 90 };
		int k = 3;
		for (int i : maxKDistinct(nums, k)) {
			System.out.println(i);
		}
	}

	public static int[] maxKDistinct(int[] nums, int k) {
		List<Integer> ll = new ArrayList<Integer>();
		for (int i : nums) {
			if (!ll.contains(i)) {
				ll.add(i);
			}
		}
		Collections.sort(ll, (a, b) -> b - a);
		if (ll.size() <= k) {
			int[] arr = new int[ll.size()];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = ll.get(i);
			}
			return arr;
		}

		int[] arr = new int[k];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ll.get(i);
		}
		return arr;
	}
	
}
