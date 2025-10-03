package LEETCODE;

import java.util.*;

public class Combinations_77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4, k = 3;
		List<Integer> ll = new ArrayList<Integer>();
		List<List<Integer>> nl = new ArrayList<List<Integer>>();
		print(n, k, 1, ll, nl);
		System.out.println(nl);
	}

	public static void print(int n, int k, int i, List<Integer> ll, List<List<Integer>> nl) {
		if (k == 0) {
			nl.add(new ArrayList<Integer>(ll));
			return;
		}
		if (i > n) {
			return;
		}
		for (int j = i; j <= n; j++) {
			ll.add(j);
			print(n, k - 1, j+1, ll, nl);
			ll.remove(ll.size() - 1);
		}
	}
}
