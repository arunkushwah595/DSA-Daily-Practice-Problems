package LEETCODE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Maximum_Sum_of_Three_Numbers_Divisible_by_Three_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 4, 2, 3, 1 };
		System.out.println(maximumSum(nums));
	}

	public static int maximumSum(int[] nums) {
		List<Integer> ll0 = new ArrayList<>();
		List<Integer> ll1 = new ArrayList<>();
		List<Integer> ll2 = new ArrayList<>();

		for (int i : nums) {
			if (i % 3 == 0) {
				ll0.add(i);
			} else if (i % 3 == 1) {
				ll1.add(i);
			} else {
				ll2.add(i);
			}
		}

		ll0.sort(Collections.reverseOrder());
		ll1.sort(Collections.reverseOrder());
		ll2.sort(Collections.reverseOrder());

		int ans = 0;
		if (ll0.size() > 0 && ll1.size() > 0 && ll2.size() > 0) {
			ans = Math.max(ans, ll0.get(0) + ll1.get(0) + ll2.get(0));
		}

		if (ll0.size() > 2) {
			ans = Math.max(ans, ll0.get(0) + ll0.get(1) + ll0.get(2));
		}

		if (ll1.size() > 2) {
			ans = Math.max(ans, ll1.get(0) + ll1.get(1) + ll1.get(2));
		}

		if (ll2.size() > 2) {
			ans = Math.max(ans, ll2.get(0) + ll2.get(1) + ll2.get(2));
		}
		return ans;
	}

}
