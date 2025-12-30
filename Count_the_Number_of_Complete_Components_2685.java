package LEETCODE;

import java.util.ArrayList;
import java.util.HashMap;

public class Count_the_Number_of_Complete_Components_2685 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		int[][] edges = { { 0, 1 }, { 0, 2 }, { 1, 2 }, { 3, 4 }, { 3, 5 } };
		System.out.println(countCompleteComponents(n, edges));
	}

	public static int countCompleteComponents(int n, int[][] edges) {
		int cnt = 0;
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			map.put(i, new ArrayList<>());
		}

		for (int[] a : edges) {
			map.get(a[0]).add(a[1]);
			map.get(a[1]).add(a[0]);
		}
		boolean[] visited = new boolean[n];
		for (int i = 0; i < n; i++) {
			if (!visited[i]) {
				ArrayList<Integer> ll = new ArrayList<Integer>();
				dfs(map, visited, i, ll);
				int v = ll.size();
				boolean possible = true;
				for (int ver : ll) {
					if (map.get(ver).size() != v - 1) {
						possible = false;
						break;
					}
				}
				if (possible) {
					cnt++;
				}
			}
		}
		return cnt;
	}

	public static void dfs(HashMap<Integer, ArrayList<Integer>> map, boolean[] visited, int i, ArrayList<Integer> ll) {
		visited[i] = true;
		ll.add(i);
		for (int nbrs : map.get(i)) {
			if (!visited[nbrs]) {
				dfs(map, visited, nbrs, ll);
			}
		}
	}

}
