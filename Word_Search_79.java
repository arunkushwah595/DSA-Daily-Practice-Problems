package LEETCODE;

import java.util.*;

public class Word_Search_79 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board = { { 'a' } };
		boolean[][] visited = new boolean[board.length][board[0].length];
		String word = "a";
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == word.charAt(0)) {
					if (print(board, visited, i, j, 0, word)) {
						System.out.println(true);
					}
				}
			}
		}

		System.out.println(false);
	}

	public static boolean print(char[][] maze, boolean[][] visited, int cr, int cc, int idx, String word) {
		if (idx == word.length()) {
			return true;
		}
		if (cr < 0 || cc < 0 || cr >= maze.length || cc >= maze[0].length || visited[cr][cc]
				|| maze[cr][cc] != word.charAt(idx)) {
			return false;
		}
		visited[cr][cc] = true;
		int[] r = { -1, 0, 1, 0 };
		int[] c = { 0, -1, 0, 1 };
		for (int i = 0; i < c.length; i++) {
			if (print(maze, visited, cr + r[i], cc + c[i], idx + 1, word)) {
				return true;
			}
		}
		visited[cr][cc] = false;
		return false;
	}
}
