package LEETCODE;

import java.util.Arrays;
import java.util.HashSet;

public class Longest_Word_in_Dictionary_720 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = { "a", "banana", "app", "appl", "ap", "apply", "apple" };
		System.out.println(longestWord(words));
	}

	public static String longestWord(String[] words) {
		String ans = "";
		Arrays.sort(words);
		HashSet<String> set = new HashSet<String>();
		for (String s : words) {
			if (s.length() == 1 || set.contains(s.substring(0, s.length() - 1))) {
				set.add(s);
				if (s.length() > ans.length()) {
					ans = s;
				}
			}
		}
		return ans;
	}

}
