package LEETCODE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Determine_if_Two_String_Are_Close_1657 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word1 = "abc", word2 = "bca";
		System.out.println(closeStrings(word1, word2));
	}

	public static boolean closeStrings(String word1, String word2) {
		if (word1.length() != word2.length()) {
			return false;
		}
		HashMap<Character, Integer> map1 = new HashMap<>();
		HashMap<Character, Integer> map2 = new HashMap<>();
		for (char ch : word1.toCharArray()) {
			map1.put(ch, map1.getOrDefault(ch, 0) + 1);
		}
		for (char ch : word2.toCharArray()) {
			map2.put(ch, map2.getOrDefault(ch, 0) + 1);
		}
		if (!map1.keySet().equals(map2.keySet())) {
			return false;
		}

		ArrayList<Integer> ll1 = new ArrayList<>(map1.values());
		ArrayList<Integer> ll2 = new ArrayList<>(map2.values());
		Collections.sort(ll1);
		Collections.sort(ll2);
		for (int i = 0; i < ll1.size(); i++) {
			if (!ll1.get(i).equals(ll2.get(i))) {
				return false;
			}
		}
		return true;
	}

}
