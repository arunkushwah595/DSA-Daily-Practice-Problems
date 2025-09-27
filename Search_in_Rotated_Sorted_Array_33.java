package LEETCODE;

import java.util.*;

public class Search_in_Rotated_Sorted_Array_33 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
		int target = 0;
		System.out.println(search(nums, target));
	}

	public static int search(int[] nums, int target) {
		return binary_search(nums, target);
	}

	public static int binary_search(int[] arr, int k) {
		int lo = 0;
		int hi = arr.length - 1;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (arr[mid] == k) {
				return mid;
			}
			if (arr[lo] <= arr[mid]) {
				if (k >= arr[lo] && k < arr[mid]) {
					hi = mid - 1;
				} else {
					lo = mid + 1;
				}
			} else {
				if (k > arr[mid] && k <= arr[hi]) {
					lo = mid + 1;
				} else {
					hi = mid - 1;
				}
			}
		}
		return -1;
	}

}
