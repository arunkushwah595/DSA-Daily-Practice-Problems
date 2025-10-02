package LEETCODE;

import java.util.Arrays;

public class Assign_Cookies_455 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] g = { 1, 2, 3 }, s = { 1, 1 };
		System.out.println(findContentChildren(g, s));
	}

	public static int findContentChildren(int[] g, int[] s) {
		Arrays.sort(g);
		Arrays.sort(s);
		int c = 0;
		int i = 0, j = 0;
		while (i < g.length && j < s.length) {
			if (g[i] <= s[j]) {
				c++;
				i++;
			}
			j++;
		}
		return c;
	}

}
