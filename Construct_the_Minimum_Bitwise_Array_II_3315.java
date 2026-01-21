package LEETCODE;

import java.util.List;

public class Construct_the_Minimum_Bitwise_Array_II_3315 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int[] minBitwiseArray(List<Integer> nums) {
		int n = nums.size();
		int ans[] = new int[n];
		for (int i = 0; i < n; i++) {
			if (nums.get(i) == 2) {
				ans[i] = -1;
			} else {
				ans[i] = fun(nums.get(i));
			}

		}
		return ans;
	}

	public static int fun(int s) {
		String bin = Integer.toBinaryString(s);
		if (bin.charAt(bin.length() - 2) == '0') {
			return s - 1;
		}
		int idx = 0;
		bin = '0' + bin;
		for (int i = bin.length() - 1; i >= 0; i--) {
			if (bin.charAt(i) == '0') {
				idx = i + 1;
				break;
			}
		}
		return Integer.parseInt(bin.substring(0, idx) + '0' + bin.substring(idx + 1), 2);
	}


}
