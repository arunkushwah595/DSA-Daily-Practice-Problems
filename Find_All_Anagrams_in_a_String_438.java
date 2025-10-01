package LEETCODE;

import java.util.*;

public class Find_All_Anagrams_in_a_String_438 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "cbaebabacd", p = "abc";
				
		
		System.out.println(findAnagrams(s, p));
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

}
