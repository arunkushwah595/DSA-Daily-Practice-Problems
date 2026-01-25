package LEETCODE;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Longest_Word_in_Dictionary_through_Deleting_524 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abpcplea";
		List<String> dictionary = Arrays.asList("ale", "apple", "monkey", "plea");
		System.out.println(findLongestWord(s, dictionary));
	}

	public static String findLongestWord(String s, List<String> dictionary) {
		Collections.sort(dictionary, (a, b) -> a.length() == b.length() ? a.compareTo(b) : b.length() - a.length());
		for (String ss : dictionary) {
			if (isSubsequence(s, ss)) {
				return ss;
			}
		}
		return "";
	}

	private static boolean isSubsequence(String s, String ss) {
		// TODO Auto-generated method stub
		int i = 0;
		int j = 0;
		while (i < s.length() && j < ss.length()) {
			if (s.charAt(i) == ss.charAt(j)) {
				j++;
			}
			i++;
		}
		return (j == ss.length());
	}

}
