package LEETCODE;

import java.util.PriorityQueue;

public class Last_Stone_Weight_1046 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] stones = { 2, 7, 4, 1, 8, 1 };
		System.out.println(lastStoneWeight(stones));
	}

	public static int lastStoneWeight(int[] stones) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a, b) -> b - a);
		for (int i : stones) {
			pq.add(i);
		}

		while (pq.size() > 1) {
			int a = pq.poll();
			int b = pq.poll();
			if (a != b) {
				pq.add(a - b);
			}
		}
		return pq.isEmpty() ? 0 : pq.poll();
	}

}
