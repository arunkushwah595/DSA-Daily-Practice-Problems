package LEETCODE;

import java.util.Arrays;
import java.util.Stack;

public class Car_Fleet_853 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int target = 12;
		int[] position = { 10, 8, 0, 5, 3 }, speed = { 2, 4, 1, 1, 3 };
		System.out.println(carFleet(target, position, speed));
	}

	public static int carFleet(int target, int[] position, int[] speed) {
		int[][] arr = new int[position.length][2];
		for (int i = 0; i < arr.length; i++) {
			arr[i][0] = position[i];
			arr[i][1] = speed[i];
		}
		Arrays.sort(arr, (a, b) -> b[0] - a[0]);
		Stack<Double> st = new Stack<Double>();
		for (int[] car : arr) {
			int pos = car[0];
			int sp = car[1];
			double time = (double) (target - pos) / sp;
			if (st.isEmpty() || st.peek() < time) {
				st.push(time);
			}
		}
		return st.size();

	}

}
