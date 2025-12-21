package LEETCODE;

import java.util.HashMap;
import java.util.Map;

public class Minimum_Swaps_to_Avoid_Forbidden_Values_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 3 }, forbidden = { 3, 2, 1 };
		System.out.println(minswap(nums, forbidden));
	}

	public static int minswap(int[] arr, int[] ban) {
		int n = arr.length;
		HashMap<Integer, Integer> cmap = new HashMap<>();
		HashMap<Integer, Integer> bcmap = new HashMap<>();

		for (int i : arr) {
			cmap.put(i, cmap.getOrDefault(i, 0) + 1);
		}
		for (int i : ban) {
			bcmap.put(i, bcmap.getOrDefault(i, 0) + 1);
		}
		for (int key : cmap.keySet()) {
			int total = cmap.get(key);
			int blocked = bcmap.getOrDefault(key, 0);
			if (total > n - blocked) {
				return -1;
			}
		}

		int badi = 0;
		int sameval = 0;
		HashMap<Integer, Integer> badValueFreq = new HashMap<>();
		for (int i = 0; i < n; i++) {
			if (arr[i] == ban[i]) {
				badi++;
				int updated = badValueFreq.getOrDefault(arr[i], 0) + 1;
				badValueFreq.put(arr[i], updated);
				sameval = Math.max(sameval, updated);
			}
		}

		if (badi == 0) {
			return 0;
		}

		int minRequired = (badi + 1) / 2;
		return Math.max(sameval, minRequired);
	}

}
