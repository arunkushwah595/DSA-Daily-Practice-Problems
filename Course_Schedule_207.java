package LEETCODE;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Course_Schedule_207 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numCourses = 2;
		int[][] prerequisites = { { 1, 0 } };
		System.out.println(canFinish(numCourses, prerequisites));
	}

	private static HashMap<Integer, List<Integer>> map;

	public static boolean canFinish(int numCourses, int[][] prerequisites) {
		map = new HashMap<>();
		for (int i = 0; i < numCourses; i++) {
			map.put(i, new ArrayList<>());
		}
		for (int[] e : prerequisites) {
			AddEdge(e[1], e[0]);
		}
		int[] in = new int[numCourses];
		for (int i = 0; i < numCourses; i++) {
			for (int v : map.get(i)) {
				in[v]++;
			}
		}
		Queue<Integer> q = new LinkedList<Integer>();
		for (int i = 0; i < in.length; i++) {
			if (in[i] == 0) {
				q.add(i);
			}
		}
		int c = 0;
		while (!q.isEmpty()) {
			int r = q.poll();
			c++;
			for (int nbrs : map.get(r)) {
				in[nbrs]--;
				if (in[nbrs] == 0) {
					q.add(nbrs);
				}
			}
		}
		return c == numCourses;
	}

	public static void AddEdge(int a, int b) {
		map.get(a).add(b);
	}

}
