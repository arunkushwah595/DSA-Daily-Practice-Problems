package LEETCODE;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Find_if_Path_Exists_in_Graph_1971 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3, source = 0, destination = 2;
		int[][] edges = { { 0, 1 }, { 1, 2 }, { 2, 0 } };
		System.out.println(validPath(n, edges, source, destination));
	}

	public static boolean validPath(int n, int[][] edges, int source, int destination) {
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			map.put(i, new ArrayList<>());
		}
		for (int[] a : edges) {
			AddEdge(a[0], a[1], map);
		}
		Queue<Integer> q = new LinkedList<Integer>();
		HashSet<Integer> visited = new HashSet<Integer>();
		q.add(source);
		while (!q.isEmpty()) {
			int r = q.poll();

			// 2. Ignore if Already Visited
			if (visited.contains(r)) {
				continue;
			}

			// 3. Mark Visited
			visited.add(r);

			// 4. Self Work
			if (r == destination) {
				return true;
			}

			// 5. Add Unvisited NBRS
			for (int nbrs : map.get(r)) {
				if (!visited.contains(nbrs)) {
					q.add(nbrs);
				}
			}
		}
		return false;

	}

	public static void AddEdge(int a, int b, HashMap<Integer, ArrayList<Integer>> map) {
		map.get(a).add(b);
		map.get(b).add(a);
	}
}
