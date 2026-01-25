package LEETCODE;

import java.util.ArrayList;

public class Rotate_Non_Negative_Elements_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 8, 14, -12 };
		int k = 3;
		for (int i : rotateElements(nums, k)) {
			System.out.println(i);
		}
	}

	public static int[] rotateElements(int[] nums, int k) {
		ArrayList<Integer> ll = new ArrayList<>();
		for (int i : nums) {
			if (i >= 0) {
				ll.add(i);
			}
		}
		int n = ll.size();
		if (n == 0) {
			return nums;
		}
		k = k % n;
		if (k == 0) {
			return nums;
		}
		rotate(ll, k);
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] >= 0) {
				nums[i] = ll.remove(0);
			}
		}
		return nums;
	}

	private static void rotate(ArrayList<Integer> ll, int k) {
		reverse(ll, 0, k - 1);
		reverse(ll, k, ll.size() - 1);
		reverse(ll, 0, ll.size() - 1);
	}

	private static void reverse(ArrayList<Integer> ll, int l, int r) {
		while (l < r) {
			int temp = ll.get(l);
			ll.set(l, ll.get(r));
			ll.set(r, temp);
			l++;
			r--;
		}
	}
}
