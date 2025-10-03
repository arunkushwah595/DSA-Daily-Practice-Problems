package LEETCODE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination_Sum_II_40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] candidates = { 10, 1, 2, 7, 6, 1, 5 };
		int target = 8;
		Arrays.sort(candidates);
		List<List<Integer>> nl = new ArrayList<List<Integer>>();
		List<Integer> ll = new ArrayList<Integer>();
		Combination(candidates, target, ll, 0, nl);
		System.out.println(nl);

	}

	public static void Combination(int[] coin, int amount, List<Integer> ll, int idx, List<List<Integer>> nl) {
		if (amount == 0) {
			nl.add(new ArrayList<Integer>(ll));
			return;
		}
		for (int i = idx; i < coin.length; i++) {

			if (i > idx && coin[i] == coin[i - 1]) {
				continue;
			}

			if (amount >= coin[i]) {
				ll.add(coin[i]);
				Combination(coin, amount - coin[i], ll, i + 1, nl);
				ll.remove(ll.size() - 1);
			}
		}
	}

}
