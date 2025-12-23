package LEETCODE;

import java.util.HashMap;

public class Find_And_Replace_in_String_833 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcd";
		int[] indices = { 0, 2 };
		String[] sources = { "ab", "ec" }, targets = { "eee", "ffff" };
		System.out.println(findReplaceString(s, indices, sources, targets));
	}

	public static String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < targets.length; i++) {
			if (s.startsWith(sources[i], indices[i])) {
				map.put(indices[i], i);
			}
		}

		StringBuilder sb = new StringBuilder();
		int i = 0;
		while (i < s.length()) {
			if (!map.containsKey(i)) {
				sb.append(s.charAt(i));
				i++;
			} else {
				sb.append(targets[map.get(i)]);
				i += sources[map.get(i)].length();
			}
		}
		return sb.toString();

	}

}
