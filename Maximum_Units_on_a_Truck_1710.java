package LEETCODE;

import java.util.Arrays;

public class Maximum_Units_on_a_Truck_1710 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] boxTypes = { { 1, 3 }, { 2, 2 }, { 3, 1 } };
		int truckSize = 4;
		System.out.println(maximumUnits(boxTypes, truckSize));
	}

	public static int maximumUnits(int[][] boxTypes, int truckSize) {
		return maxunits(boxTypes, truckSize);
	}

	public static int maxunits(int[][] arr, int target) {
		Arrays.sort(arr, (a, b) -> b[1] - a[1]);
		int totalunits = 0;
		for (int[] a : arr) {
			int box = Math.min(target, a[0]);
			totalunits += box * a[1];
			target -= box;
			if (target == 0) {
				return totalunits;
			}
		}
		return totalunits;
	}

}
