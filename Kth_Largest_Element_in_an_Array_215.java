package lec43;

import java.util.*;

public class Kth_Largest_Element_in_an_Array_215 {

	public static void main(String[] args) {
		int[] nums = { 3, 2, 1, 5, 6, 4 };
		int k = 2;
		System.out.println(Kth_Largest(nums, k));
	}

	public static int Kth_Largest(int[] arr, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for (int i = 0; i < k; i++) {
			pq.add(arr[i]);
		}
		for (int i = k; i < arr.length; i++) {
			if (arr[i] > pq.peek()) {
				pq.poll();
				pq.add(arr[i]);
			}
		}
		return pq.peek();
	}

}
