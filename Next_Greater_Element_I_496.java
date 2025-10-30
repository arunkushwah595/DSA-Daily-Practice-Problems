package LEETCODE;

public class Next_Greater_Element_I_496 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = { 4, 1, 2 }, nums2 = { 1, 3, 4, 2 };
		for (int i : nextGreaterElement(nums1, nums2)) {
			System.out.println(i);
		}
	}

	public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
		int idx = 0;
		for (int v : nums1) {
			int ans = v;
			boolean isfoud = false;
			for (int i = 0; i < nums2.length; i++) {
				ans = Math.max(nums2[i], ans);
				if (ans > v && isfoud) {
					break;
				}
				if (nums2[i] == v) {
					ans = v;
					isfoud = true;
				}
			}
			if (ans == v) {
				ans = -1;
			}
			nums1[idx++] = ans;
		}

		return nums1;
	}

}
