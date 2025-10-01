package LEETCODE;

import java.util.*;

public class Permutation_in_String_567 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abc", s2 = "eidbcaooo";
		System.out.println(checkInclusion(s1, s2));
	}

	public static boolean checkInclusion(String s1, String s2) {

		if (s1.length() > s2.length()) {
			return false;
		}

		HashMap<Character, Integer> map = new HashMap<>();
		for (char ch : s1.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		int c = 0;
		int si = 0, ei = 0;
		while (ei < s2.length()) {
			if (!map.containsKey(s2.charAt(ei))) {
				while (si < ei) {
					map.put(s2.charAt(si), map.get(s2.charAt(si)) + 1);
					si++;
					c--;
				}
				si++;
				ei++;
			} else {
				while (si < ei && map.get(s2.charAt(ei)) == 0) {
					map.put(s2.charAt(si), map.get(s2.charAt(si)) + 1);
					si++;
					c--;
				}
				map.put(s2.charAt(ei), map.get(s2.charAt(ei)) - 1);
				ei++;
				c++;
				if (c == s1.length()) {
					return true;
				}
			}
		}

		return false;
	}

}
