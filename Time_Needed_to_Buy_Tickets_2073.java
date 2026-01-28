package LEETCODE;

import java.util.LinkedList;
import java.util.Queue;

public class Time_Needed_to_Buy_Tickets_2073 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tickets = { 15, 66, 3, 47, 71, 27, 54, 43, 97, 34, 94, 33, 54, 26, 15, 52, 20, 71, 88, 42, 50, 6, 66, 88,
				36, 99, 27, 82, 7, 72 };
		int k = 18;
		System.out.println(timeRequiredToBuy2(tickets, k));
		System.out.println(timeRequiredToBuy1(tickets, k));
	}

//	----------------- BY QUEUE -----------------

	public static int timeRequiredToBuy1(int[] tickets, int k) {
		Queue<Integer> q = new LinkedList<Integer>();
		for (int i = 0; i < tickets.length; i++) {
			q.offer(i);
		}

		int total = 0;
		while (!q.isEmpty()) {
			int idx = q.poll();
			total++;
			tickets[idx]--;
			if (tickets[idx] != 0) {
				q.add(idx);
			} else {
				if (idx == k) {
					return total;
				}
			}
		}
		return total;
	}

//	------------------ MATHS -----------------

	private static int timeRequiredToBuy2(int[] tickets, int k) {
		// TODO Auto-generated method stub
		int total = 0;
		for (int i = 0; i < tickets.length; i++) {
			if (i <= k) {
				total += Math.min(tickets[i], tickets[k]);
			} else {
				total += Math.min(tickets[i], tickets[k] - 1);
			}
		}
		return total;
	}

}
