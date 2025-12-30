package LEETCODE;

import java.util.LinkedList;
import java.util.Queue;

public class Shortest_Path_in_Binary_Matrix_1091 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = { { 0, 0, 0 }, { 1, 1, 0 }, { 1, 1, 0 } };
		System.out.println(shortestPathBinaryMatrix(grid));
	}

	public static int shortestPathBinaryMatrix(int[][] grid) {
		int n = grid.length;
		if (grid[0][0] == 1 || grid[n - 1][n - 1] == 1) {
			return -1;
		}
		int[][] directions = { { 1, 0 }, { 0, 1 }, { 1, 1 }, { 1, -1 }, { -1, 1 }, { -1, -1 }, { -1, 0 }, { 0, -1 } };
		Queue<int[]> q = new LinkedList<>();
		q.offer(new int[] { 0, 0 });
		grid[0][0] = 1;
		int dist = 0;

		while (!q.isEmpty()) {
			int size = q.size();
			dist++;
			for (int i = 0; i < size; i++) {
				int[] curr = q.poll();
				if (curr[0] == n - 1 && curr[1] == n - 1)
					return dist;
				for (int[] d : directions) {
					int x = curr[0] + d[0];
					int y = curr[1] + d[1];
					if (x < 0 || y < 0 || x >= n || y >= n || grid[x][y] == 1)
						continue;
					grid[x][y] = 1;
					q.offer(new int[] { x, y });
				}
			}
		}
		return -1;
	}
}
