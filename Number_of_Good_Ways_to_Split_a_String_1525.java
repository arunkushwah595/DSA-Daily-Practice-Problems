package LEETCODE;

import java.util.HashMap;
import java.util.HashSet;

public class Number_of_Good_Ways_to_Split_a_String_1525 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aacaba";
		System.out.println(numSplits(s));
	}

	public static int numSplits(String s) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		HashSet<Character> set = new HashSet<Character>();
		for (char ch : s.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		int c = 0;
		for (char ch : s.toCharArray()) {
			set.add(ch);
			map.put(ch, map.getOrDefault(ch, 0) - 1);
			if (map.get(ch) <= 0) {
				map.remove(ch);
			}
			if (map.size() == set.size()) {
				c++;
			}
		}
		return c;
	}

}
