package LEETCODE;

public class Find_Champion_II_2924 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		int[][] edges = { { 0, 1 }, { 1, 2 } };
		System.out.println(findChampion(n, edges));
	}

	public static int findChampion(int n, int[][] edges) {
		int[] in = new int[n];
		for (int i = 0; i < edges.length; i++) {
			in[edges[i][1]]++;
		}
		int c = 0;
		int idx = 0;
		for (int i = 0; i < in.length; i++) {
			if (in[i] == 0) {
				idx = i;
				c++;
			}
			if (c == 2) {
				return -1;
			}
		}
		return idx;
	}

}
