package LEETCODE;

import java.util.HashMap;
import java.util.PriorityQueue;

public class Maximum_Total_from_Optimal_Activation_Order_3645 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] value = { 3, 5, 8 };
		int[] limit = { 2, 1, 3 };
		System.out.println(maxTotal(value, limit));
	}

	public static long maxTotal(int[] value, int[] limit) {
		HashMap<Integer, PriorityQueue<Integer>> map = new HashMap<>();
		for (int i = 0; i < limit.length; i++) {
			if (!map.containsKey(limit[i])) {
				map.put(limit[i], new PriorityQueue<>());
			}
			PriorityQueue<Integer> pq = map.get(limit[i]);
			pq.add(value[i]);
			if (pq.size() > limit[i]) {
				pq.poll();
			}
		}

		long total = 0;
		for (int key : map.keySet()) {
			PriorityQueue<Integer> pq = map.get(key);
			while (!pq.isEmpty()) {
				total += pq.poll();
			}
		}
		return total;
	}

}
