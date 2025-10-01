package LEETCODE;

import java.util.HashMap;

public class Longest_Substring_with_At_Most_Two_Distinct_Characters_340 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "eceba";
		int k = 2;
		System.out.println(lengthOfLongestSubstringKDistinct(s, k));
	}

	public static int lengthOfLongestSubstringKDistinct(String s, int k) {
		HashMap<Character, Integer> map = new HashMap<>();
		int ans = 0;
		int si = 0, ei = 0;
		while (ei < s.length()) {

			map.put(s.charAt(ei), map.getOrDefault(s.charAt(ei), 0) + 1);
			while (map.size() > k) {
				map.put(s.charAt(si), map.get(s.charAt(si)) - 1);
				if (map.get(s.charAt(si)) == 0) {
					map.remove(s.charAt(si));
				}
				si++;
			}
			ans = Math.max(ans, ei - si + 1);
			ei++;
		}
		return ans;
	}

}
