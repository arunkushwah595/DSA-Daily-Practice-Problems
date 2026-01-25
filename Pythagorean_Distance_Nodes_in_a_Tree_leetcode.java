package LEETCODE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Pythagorean_Distance_Nodes_in_a_Tree_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;

		int[][] edges = { { 0, 1 }, { 0, 2 }, { 0, 3 } };

		int x = 1;
		int y = 2;
		int z = 3;
		System.out.println(specialNodes(n, edges, x, y, z));
	}

	public static int specialNodes(int n, int[][] edges, int x, int y, int z) {
		ArrayList<ArrayList<Integer>> ll = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			ll.add(new ArrayList<>());
		}
		for (int[] e : edges) {
			ll.get(e[0]).add(e[1]);
			ll.get(e[1]).add(e[0]);
		}

		int[] dx = bfs(x, ll, n);
		int[] dy = bfs(y, ll, n);
		int[] dz = bfs(z, ll, n);

		int count = 0;

		for (int i = 0; i < n; i++) {
			int a = dx[i], b = dy[i], c = dz[i];
			int[] arr = { a, b, c };
			Arrays.sort(arr);
			if (arr[0] * arr[0] + arr[1] * arr[1] == arr[2] * arr[2]) {
				count++;
			}
		}

		return count;
	}

	private static int[] bfs(int val, ArrayList<ArrayList<Integer>> ll, int n) {
		int[] dist = new int[n];
		Arrays.fill(dist, -1);
		Queue<Integer> q = new LinkedList<>();
		q.offer(val);
		dist[val] = 0;
		while (!q.isEmpty()) {
			int c = q.poll();
			for (int nbrs : ll.get(c)) {
				if (dist[nbrs] == -1) {
					dist[nbrs] = dist[c] + 1;
					q.offer(nbrs);
				}
			}
		}
		return dist;
	}

}
