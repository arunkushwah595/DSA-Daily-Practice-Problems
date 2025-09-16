package LEETCODE;

import java.util.HashMap;

public class Number_of_Pairs_of_Interchangeable_Rectangles_2001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] rectangles = { { 4, 8 }, { 3, 6 }, { 10, 20 }, { 15, 30 } };
		System.out.println(interchangeableRectangles(rectangles));
	}

	public static long interchangeableRectangles(int[][] rectangles) {
		HashMap<Double, Integer> hm = new HashMap<Double, Integer>();
		for (int[] arr : rectangles) {
			double ratio = (double) arr[0] / arr[1];
			hm.put(ratio, hm.getOrDefault(ratio, 0) + 1);
		}
		long sum = 0;
		for (int val : hm.values()) {
			sum += summation(val - 1);
		}
		return sum;
	}

	private static long summation(int val) {
		// TODO Auto-generated method stub
		long sum = 0;
		sum = ((long) val * (long) (val + 1)) / 2;
		return sum;
	}

}
