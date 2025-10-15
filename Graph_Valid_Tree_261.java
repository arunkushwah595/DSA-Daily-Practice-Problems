package Lec53;

import java.util.*;

public class Graph_Valid_Tree_261 {

	// You have a graph of n nodes labeled from 0 to n - 1. You are given an integer
	// n and a list of edges where edges[i] = [ai, bi] indicates that there is an
	// undirected edge between nodes ai and bi in the graph. Return true if the
	// edges of the given graph make up a valid tree,and false otherwise

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int[][] edges = { { 0, 1 }, { 0, 2 }, { 0, 3 }, { 1, 4 } };
		System.out.println(validTree(n, edges));
	}

	public static boolean validTree(int n, int[][] edges) {
		HashMap<Integer, List<Integer>> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			map.put(i, new ArrayList<>());
		}

		for (int[] arr : edges) {
			int v1 = arr[0];
			int v2 = arr[1];
			map.get(v1).add(v2);
			map.get(v2).add(v1);
		}
		return BFT(map);
	}

	private static boolean BFT(HashMap<Integer, List<Integer>> map) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		int c = 0; // Component count
		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			c++;
			q.add(src);
			while (!q.isEmpty()) {

				// 1. remove
				int r = q.poll();

				// 2. Ignore if Already visited
				if (visited.contains(r)) {
					return false; // Cycle mil gayax`
				}

				// 3. Marked visited
				visited.add(r);

				// 4. self Work
//				System.out.print(r + " ");

				// 5. Add Unvisited nbrs
				for (int nbrs : map.get(r)) {
					if (!visited.contains(nbrs)) {
						q.add(nbrs);
					}
				}
			}
		}
		return c == 1;
	}

}
