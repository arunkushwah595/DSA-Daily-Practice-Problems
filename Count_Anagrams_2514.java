package LEETCODE;

import java.util.*;

public class Count_Anagrams_2514 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "b ykbmq tybq zmcsq jp";
		System.out.println(countAnagrams(s));
	}

	public static int countAnagrams(String s) {
		String[] arr = s.split(" ");
		long count = 1;
		for (String str : arr) {
			count *= (count(str) % 1000000007);
		}
		int ans = (int) (count % 1000000007);
		return ans;
	}

	public static long count(String s) {
		HashMap<Character, Integer> set = new HashMap<>();
		long[] dp = new long[s.length() + 1];
		dp[0] = 1;
		for (int i = 1; i < dp.length; i++) {
			dp[i] = dp[i - 1] * i;
		}
		for (int i = 0; i < s.length(); i++) {
			set.put(s.charAt(i), set.getOrDefault(s.charAt(i), 0) + 1);
		}
		long div = 1;
		for (char key : set.keySet()) {
			div *= (dp[set.get(key)] % 1000000007);
		}
		return (dp[s.length()] / div) % 1000000007;
	}

}
