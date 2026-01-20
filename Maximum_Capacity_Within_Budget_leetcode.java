package LEETCODE;

import java.util.Arrays;

public class Maximum_Capacity_Within_Budget_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] costs = { 4, 8, 5, 3 }, capacity = { 1, 5, 2, 7 };
		int budget = 8;
		System.out.println(maxCapacity(costs, capacity, budget));
	}

	public static int maxCapacity(int[] costs, int[] capacity, int budget) {
		int n = costs.length;
		int[][] arr = new int[n][2];

		for (int i = 0; i < n; i++) {
			arr[i][0] = costs[i];
			arr[i][1] = capacity[i];
		}

		Arrays.sort(arr, (a, b) -> a[0] - b[0]);

		int[] preMax = new int[n];
		preMax[0] = arr[0][1];
		for (int i = 1; i < n; i++) {
			preMax[i] = Math.max(preMax[i - 1], arr[i][1]);
		}

		int ans = 0;

		for (int i = 0; i < n; i++) {
			if (arr[i][0] < budget) {
				ans = Math.max(ans, arr[i][1]);
			}

			int rem = budget - arr[i][0];
			if (rem <= 0 || i == 0) {
				continue;
			}
			int idx = upperBound(arr, rem - 1);

			idx = Math.min(idx, i - 1);

			if (idx >= 0) {
				ans = Math.max(ans, arr[i][1] + preMax[idx]);
			}
		}

		return ans;
	}

	private static int upperBound(int[][] arr, int target) {
		int lo = 0, hi = arr.length - 1, idx = -1;
		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			if (arr[mid][0] <= target) {
				idx = mid;
				lo = mid + 1;
			} else {
				hi = mid - 1;
			}
		}
		return idx;
	}

}
