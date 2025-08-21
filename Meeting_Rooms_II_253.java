package lec44;

import java.util.*;

public class Meeting_Rooms_II_253 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 0, 30 }, { 5, 10 }, { 15, 20 } };
		System.out.println(Meerting_Room(arr));
	}

	public static int Meerting_Room(int[][] arr) {
		Arrays.sort(arr, (a, b) -> a[0] - b[0]);
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(arr[0][1]);
		for (int i = 1; i < arr.length; i++) {
			if (arr[i][0] >= pq.peek()) {
				pq.poll();
			}
			pq.add(arr[i][1]);
		}
		return pq.size();
	}

}
