package LEETCODE;

import java.util.ArrayList;
import java.util.List;

public class Longest_Unequal_Adjacent_Groups_Subsequence_I_2900 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = { "e", "a", "b" };
		int[] groups = { 0, 0, 1 };
		System.out.println(getLongestSubsequence(words, groups));

	}

	public static List<String> getLongestSubsequence(String[] words, int[] groups) {
		List<String> ll = new ArrayList<String>();
		ll.add(words[0]);
		for (int i = 1; i < words.length; i++) {
			if (groups[i] != groups[i - 1]) {
				ll.add(words[i]);
			}
		}
		return ll;
	}

}
