package LEETCODE;

import java.util.Arrays;

public class Queue_Reconstruction_by_Height_406 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] people = { { 7, 0 }, { 4, 4 }, { 7, 1 }, { 5, 0 }, { 6, 1 }, { 5, 2 } };
		for (int[] arr : reconstructQueue(people)) {
			System.out.println(arr[0] + " " + arr[1]);
		}
	}

	public static int[][] reconstructQueue(int[][] people) {
		Arrays.sort(people, (a, b) -> {
			if (a[0] == b[0]) {
				return a[1] - b[1];
			} else {
				return a[0] - b[0];
			}
		});
		int[][] ans = new int[people.length][people[0].length];
		boolean[] isvisited = new boolean[people.length];
		int prev = -1;
		int v = 0;
		for (int[] arr : people) {
			int c = 0;
			if (prev == arr[0]) {
				v++;
				c = v;
			} else {
				v = 0;
				c = 0;
			}
			for (int i = 0; i < isvisited.length; i++) {
				if (!isvisited[i]) {
					if (c == arr[1]) {
						ans[i] = arr;
						prev = arr[0];
						isvisited[i] = true;
						break;
					}
					c++;
				}
			}
		}
		return ans;
	}

}
