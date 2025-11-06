package LEETCODE;

import java.util.*;

public class Unique_Number_of_Occurrences_1207 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { -3, 0, 0, 1, -3, 1, 1, 1, -3, 10, 0 };
		System.out.println(uniqueOccurrences(arr));
	}

	public static boolean uniqueOccurrences(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i : arr) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}
		HashSet<Integer> set = new HashSet<>();
		for (int key : map.keySet()) {
			if (!set.add(map.get(key))) {
				return false;
			}
		}

		return true;
	}

}
