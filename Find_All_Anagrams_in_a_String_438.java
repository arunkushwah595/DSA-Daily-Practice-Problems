package LEETCODE;

import java.util.*;

public class Find_All_Anagrams_in_a_String_438 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "cbaebabacd", p = "abc";
		System.out.println(findAnagrams(s, p));
		System.out.println(findAnagrams2(s, p));
	}

	public static List<Integer> findAnagrams(String s, String p) {
		List<Integer> ll = new ArrayList<Integer>();
		int k = p.length();
		String pKey = GetKey(p, 0, p.length());
		for (int i = 0; i < s.length() - k + 1; i++) {
			String skey = GetKey(s, i, i + k);
			if (skey.equals(pKey)) {
				ll.add(i);
			}
		}

		return ll;
	}

	public static String GetKey(String s, int i, int j) {
		int[] freq = new int[26];
		for (int z = i; z < j; z++) {
			freq[s.charAt(z) - 'a']++;
		}
		StringBuilder sb = new StringBuilder();
		for (int z = 0; z < freq.length; z++) {
			sb.append(freq[z] + " ");
		}
		return sb.toString();
	}

//	----------------------------------------------------------- O P T I M I Z E D ----------------------------------------------------------------

	public static List<Integer> findAnagrams2(String s2, String s1) {
		List<Integer> ll = new ArrayList<Integer>();
		if (s1.length() > s2.length()) {
			return ll;
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
					ll.add(si);
				}
			}
		}

		return ll;
	}

}
