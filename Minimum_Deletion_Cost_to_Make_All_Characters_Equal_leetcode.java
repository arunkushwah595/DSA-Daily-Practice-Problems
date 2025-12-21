package LEETCODE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Minimum_Deletion_Cost_to_Make_All_Characters_Equal_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aabaac";
		int[] cost = { 1, 2, 3, 4, 1, 10 };
		System.out.println(minCost(s, cost));
	}

	public static long minCost(String s, int[] cost) {
		HashMap<Character, Long> map = new HashMap<>();
		for (int i = 0; i < cost.length; i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), (long) 0) + cost[i]);
		}
		ArrayList<Long> ll = new ArrayList<>();
		for (char key : map.keySet()) {
			ll.add(map.get(key));
		}
		Collections.sort(ll);
		long ans = 0l;
		for (int i = 0; i < ll.size() - 1; i++) {
			ans += ll.get(i);
		}
		return ans;
	}

}
