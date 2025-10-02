package LEETCODE;

import java.util.HashMap;

public class Integer_Replacement_397 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9;
		System.out.println(integerReplacement(n));
	}

	public static int integerReplacement(int n) {
		HashMap<Long, Integer> map = new HashMap<>();
		return replace(n, map);
	}

	public static int replace(long n, HashMap<Long, Integer> map) {
		if (n == 1) {
			return 0;
		}
		if (map.containsKey(n)) {
			return map.get(n);
		}
		int oprn = 0;
		if (n % 2 == 0) {
			oprn = 1 + replace(n / 2, map);
		} else {
			int f = 1 + replace(n + 1, map);
			int s = 1 + replace(n - 1, map);
			oprn = Math.min(f, s);
		}
		map.put(n, oprn);
		return oprn;
	}

}
