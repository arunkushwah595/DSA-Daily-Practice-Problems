package LEETCODE;

public class Node_With_Highest_Edge_Score_2374 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] edges = { 1, 0, 0, 0, 0, 7, 7, 5 };
		System.out.println(edgeScore(edges));
	}

	public static int edgeScore(int[] edges) {
		long[] arr = new long[edges.length];
		for (int i = 0; i < arr.length; i++) {
			arr[edges[i]] += i;
		}
		int maxi = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > arr[maxi]) {
				maxi = i;
			}
		}
		return maxi;
	}

}
