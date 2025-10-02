package LEETCODE;

import java.util.Arrays;

public class Maximum_Matching_of_Players_With_Trainers_2410 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] players = { 4, 7, 9 }, trainers = { 8, 2, 5, 8 };
		System.out.println(matchPlayersAndTrainers(players, trainers));
	}

	public static int matchPlayersAndTrainers(int[] players, int[] trainers) {
		return maxmatching(players, trainers);
	}

	public static int maxmatching(int[] g, int[] s) {
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
