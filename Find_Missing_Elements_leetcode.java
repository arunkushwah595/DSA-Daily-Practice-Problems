package LEETCODE;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Find_Missing_Elements_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 4, 2, 5 };
		System.out.println(findMissingElements(nums));
	}

	public static List<Integer> findMissingElements(int[] nums) {
		List<Integer> ll = new ArrayList<Integer>();
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		Set<Integer> set = new HashSet<>();
		for (int i : nums) {
			set.add(i);
			min = Math.min(min, i);
			max = Math.max(max, i);
		}
		for (int i = min; i < max; i++) {
			if (!set.contains(i)) {
				ll.add(i);
			}
		}
		return ll;
	}
}
