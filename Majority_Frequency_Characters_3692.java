package LEETCODE;

import java.util.HashMap;

public class Majority_Frequency_Characters_3692 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aaabbbccdddde";
		System.out.println(majorityFrequencyGroup(s));
	}

	public static String majorityFrequencyGroup(String s) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (char ch : s.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		int[] freq = new int[s.length()];
		for (char ch : map.keySet()) {
			freq[map.get(ch) - 1]++;
		}
		int max = 0;
		int idx = 0;
		for (int i = freq.length - 1; i >= 0; i--) {
			if (freq[i] > max) {
				max = freq[i];
				idx = i + 1;
			}
		}

		StringBuilder sb = new StringBuilder();
		for (char ch : map.keySet()) {
			if (map.get(ch) == idx) {
				sb.append(ch);
			}
		}
		return sb.toString();
	}

}
