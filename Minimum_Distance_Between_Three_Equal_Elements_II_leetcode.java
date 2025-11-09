package LEETCODE;

import java.util.ArrayList;
import java.util.HashMap;

public class Minimum_Distance_Between_Three_Equal_Elements_II_leetcode {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 1, 1, 3 };
		System.out.println(minimumDistance(nums));
	}

	public static int minimumDistance(int[] nums) {
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (!map.containsKey(nums[i])) {
				map.put(nums[i], new ArrayList<>());
			}
			map.get(nums[i]).add(i);
		}
		int mind = Integer.MAX_VALUE;
		for (int key : map.keySet()) {
			if (map.get(key).size() < 3) {
				continue;
			} else {
				for (int i = 0; i < map.get(key).size() - 3 + 1; i++) {
					int a = map.get(key).get(i);
					int b = map.get(key).get(i + 1);
					int c = map.get(key).get(i + 2);
					int d = Math.abs(a - b) + Math.abs(b - c) + Math.abs(c - a);
					mind = Math.min(mind, d);
				}
			}
		}
		if (mind != Integer.MAX_VALUE) {
			return mind;
		}
		return -1;

	}

}
