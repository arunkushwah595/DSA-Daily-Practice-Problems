package LEETCODE;

public class Minimum_Operations_to_Transform_Array_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = { 2, 8 }, nums2 = { 1, 7, 3 };
		System.out.println(minOperations(nums1, nums2));
	}

	public static long minOperations(int[] nums1, int[] nums2) {
		long opr = 1;
		int v = nums2[nums1.length];
		int mind = Integer.MAX_VALUE;
		for (int i = 0; i < nums1.length; i++) {
			if (Math.min(nums1[i], nums2[i]) <= v && Math.max(nums1[i], nums2[i]) >= v) {
				mind = 0;
			}
			mind = Math.min(mind, Math.min(Math.abs(nums1[i] - v), Math.abs(nums2[i] - v)));
			opr += Math.abs(nums1[i] - nums2[i]);
		}
		return opr + mind;
	}

}
