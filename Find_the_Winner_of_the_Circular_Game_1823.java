package LEETCODE;

import java.util.LinkedList;
import java.util.Queue;

public class Find_the_Winner_of_the_Circular_Game_1823 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5, k = 2;
		System.out.println(findTheWinner(n, k));
	}

	public static int findTheWinner(int n, int k) {
		if (k == 1) {
			return n;
		}
		Queue<Integer> q = new LinkedList<>();
		for (int i = 1; i <= n; i++) {
			q.add(i);
		}
		int c = 0;
		while (q.size() != 1) {
			c++;
			int v = q.poll();
			if (c == k) {
				c = 0;
				continue;
			}
			q.add(v);
		}
		return q.poll();
	}

}
