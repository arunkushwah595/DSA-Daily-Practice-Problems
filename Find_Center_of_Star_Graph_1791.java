package LEETCODE;

import java.util.ArrayList;
import java.util.HashMap;

public class Find_Center_of_Star_Graph_1791 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] edges = { { 1, 2 }, { 5, 1 }, { 1, 3 }, { 1, 4 } };
		System.out.println(findCenter(edges));
	}

	public static int findCenter(int[][] edges) {
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
		for (int i = 1; i <= edges.length + 1; i++) {
			map.put(i, new ArrayList<>());
		}
		for (int[] a : edges) {
			AddEdge(a[0], a[1], map);
		}
		for (int i : map.keySet()) {
			if (map.get(i).size() == edges.length) {
				return i;
			}
		}
		return -1;
	}

	public static void AddEdge(int a, int b, HashMap<Integer, ArrayList<Integer>> map) {
		map.get(a).add(b);
		map.get(b).add(a);
	}

}
