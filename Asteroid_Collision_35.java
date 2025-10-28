package LEETCODE;

import java.util.Stack;

public class Asteroid_Collision_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] asteroids = { 3, 5, -6, 2, -1, 4 };
		for (int i : asteroidCollision(asteroids)) {
			System.out.println(i);
		}
	}

	public static int[] asteroidCollision(int[] asteroids) {
		Stack<Integer> st = new Stack<>();
		for (int i : asteroids) {
			if (i < 0) {
				while (!st.isEmpty() && st.peek() >= 0 && st.peek() < -i) {
					st.pop();
				}
				if (st.isEmpty() || st.peek() < 0) {
					st.push(i);
				}
				if (st.peek() == -i) {
					st.pop();
				}
			} else {
				st.push(i);
			}
		}
		int[] ans = new int[st.size()];
		int i = st.size() - 1;
		while (!st.isEmpty()) {
			ans[i--] = st.pop();
		}
		return ans;
	}

}
