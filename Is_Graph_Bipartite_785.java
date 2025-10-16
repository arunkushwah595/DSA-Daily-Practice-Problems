package Lec54;

import java.util.*;

public class Is_Graph_Bipartite_785 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] graph = { { 1, 2, 3 }, { 0, 2 }, { 0, 1, 3 }, { 0, 2 } };
		System.out.println(isBipartite(graph));
	}

	public static boolean isBipartite(int[][] graph) {
		Queue<BipartitePair> q = new LinkedList<>();
		HashMap<Integer, Integer> visited = new HashMap<>();
		for (int i = 0; i < graph.length; i++) {
			if (visited.containsKey(i)) {
				continue;
			}
			q.add(new BipartitePair(i, 0));

			while (!q.isEmpty()) {
				// 1. Remove
				BipartitePair bp = q.poll();

				// 2. Ignore if Visited
				if (visited.containsKey(bp.vtx)) {
					if (visited.get(bp.vtx) != bp.dis) {
						return false;
					}
					continue;
				}

				// 3. Marked Visited
				visited.put(bp.vtx, bp.dis);

				// 4. Self Work

				// 5. Add unvisited nbrs
				for (int nbrs : graph[bp.vtx]) {
					if (!visited.containsKey(nbrs)) {
						q.add(new BipartitePair(nbrs, bp.dis + 1));
					}
				}
			}
		}
		return true;

	}

	static class BipartitePair {
		int vtx;
		int dis;

		public BipartitePair(int vtx, int dis) {
			// TODO Auto-generated constructor stub
			this.vtx = vtx;
			this.dis = dis;
		}

	}
}
