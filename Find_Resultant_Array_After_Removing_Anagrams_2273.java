package LEETCODE;

import java.util.ArrayList;
import java.util.List;

public class Find_Resultant_Array_After_Removing_Anagrams_2273 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = { "abba", "baba", "bbaa", "cd", "cd" };
		System.out.println(removeAnagrams(words));

	}

	public static List<String> removeAnagrams(String[] words) {
		List<String> ll = new ArrayList<String>();
		ll.add(words[0]);
		for (int i = 1; i < words.length; i++) {
			if (!isAnagram(words[i], words[i - 1])) {
				ll.add(words[i]);
			}
		}
		return ll;
	}

	private static boolean isAnagram(String s1, String s2) {
		// TODO Auto-generated method stub
		int[] freq = new int[26];
		for (char ch : s1.toCharArray()) {
			freq[ch - 'a']++;
		}
		for (char ch : s2.toCharArray()) {
			freq[ch - 'a']--;
			if (freq[ch - 'a'] < 0) {
				return false;
			}
		}
		for (int i : freq) {
			if (i != 0) {
				return false;
			}
		}
		return true;

	}

}
