package LEETCODE;

import java.util.*;

public class Sort_Characters_By_Frequency_451 {

	public static void main(String[] args) {
		String s = "tree";
		System.out.println(frequencySort(s));
	}

	public static String frequencySort(String s) {
		Map<Character, Integer> map = new HashMap<>();
		for (char ch : s.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		PriorityQueue<Character> pq = new PriorityQueue<Character>((a, b) -> map.get(b) - map.get(a));

		pq.addAll(map.keySet());

		StringBuilder sb = new StringBuilder();
		while (!pq.isEmpty()) {
			char ch = pq.poll();
			for (int i = 0; i < map.get(ch); i++) {
				sb.append(ch);
			}
		}
		return sb.toString();
	}

}
