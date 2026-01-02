package LEETCODE;

import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class All_Paths_From_Source_to_Target_797 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] graph = { { 1, 2 }, { 3 }, { 3 }, {} };
		System.out.println(allPathsSourceTarget(graph));
	}

	public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
		for (int i = 0; i < graph.length; i++) {
			map.put(i, new ArrayList<>());
		}
		List<List<Integer>> nl = new ArrayList<>();
		List<Integer> ll = new ArrayList<Integer>();
		ll.add(0);
		dfs(graph, 0, graph.length - 1, ll, nl);
		return nl;
	}

	private static void dfs(int[][] graph, int src, int des, List<Integer> ll, List<List<Integer>> nl) {
		// TODO Auto-generated method stub
		if (src == des) {
			nl.add(new ArrayList<>(ll));
			return;
		}
		for (int n : graph[src]) {
			ll.add(n);
			dfs(graph, n, des, ll, nl);
			ll.remove(ll.size() - 1);
		}

	}

}
