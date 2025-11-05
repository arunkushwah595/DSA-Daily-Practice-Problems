package LEETCODE;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Repeated_DNA_Sequences_187 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
		System.out.println(findRepeatedDnaSequences(s));
	}

	public static List<String> findRepeatedDnaSequences(String s) {
		if (s.length() < 10) {
			return new ArrayList<String>();
		}
		List<String> ll = new ArrayList<String>();
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length() - 10 + 1; i++) {
			String ss = s.substring(i, i + 10);
			map.put(ss, map.getOrDefault(ss, 0) + 1);
		}
		for (String str : map.keySet()) {
			if (map.get(str) > 1) {
				ll.add(str);
			}
		}
		return ll;
	}

}
