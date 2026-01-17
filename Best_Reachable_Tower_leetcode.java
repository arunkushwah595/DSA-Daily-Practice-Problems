package LEETCODE;

import java.util.ArrayList;
import java.util.List;

public class Best_Reachable_Tower_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] towers = { { 1, 2, 5 }, { 2, 1, 7 }, { 3, 1, 9 } };
		int[] center = { 1, 1 };
		int radius = 2;
		for (int i : bestTower(towers, center, radius)) {
			System.out.println(i);
		}
	}

	public static int[] bestTower(int[][] towers, int[] center, int radius) {
		int x = center[0];
		int y = center[1];
		ArrayList<int[]> ll = new ArrayList<>();
		for (int[] arr : towers) {
			int d = Math.abs(arr[0] - x) + Math.abs(arr[1] - y);
			if (d <= radius) {
				ll.add(arr);
			}
		}
		if (ll.isEmpty()) {
			return new int[] { -1, -1 };
		}
		ll.sort((a, b) -> {
			if (b[2] != a[2])
				return b[2] - a[2];
			if (a[0] != b[0])
				return a[0] - b[0];
			return a[1] - b[1];
		});
		return new int[] { ll.get(0)[0], ll.get(0)[1] };
	}
}
