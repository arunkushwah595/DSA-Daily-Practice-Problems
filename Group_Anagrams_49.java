package lec46;

import java.util.*;

public class Group_Anagrams_49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
		System.out.println(groupAnagrams(strs));
	}

	public static List<List<String>> groupAnagrams(String[] arr) {
		HashMap<String, List<String>> map = new HashMap<String, List<String>>();
		for (String s : arr) {
			String key = GetKey(s);
			if (!map.containsKey(key)) {
				map.put(key, new ArrayList<>());
			}
			map.get(key).add(s);
		}
		return new ArrayList<List<String>>(map.values());
	}

	public static String GetKey(String s) {
		int[] freq = new int[26];
		for (int i = 0; i < s.length(); i++) {
			freq[s.charAt(i) - 'a']++;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < freq.length; i++) {
			sb.append(freq[i]);
		}
		return sb.toString();
	}

}
