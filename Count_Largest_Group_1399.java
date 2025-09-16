package LEETCODE;

import java.util.HashMap;

public class Count_Largest_Group_1399 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 13;
		System.out.println(countLargestGroup(n));
	}

	public static int countLargestGroup(int n) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 1; i <= n; i++) {
			int sum = digit_sum(i);
			map.put(sum, map.getOrDefault(sum, 0) + 1);
		}
		int c = 0;
		int maxi = 0;
		for (int key : map.keySet()) {
			if (map.get(key) > maxi) {
				c = 1;
				maxi = map.get(key);
			} else if (map.get(key) == maxi) {
				c++;
			}
		}
		return c;
	}

	public static int digit_sum(int n) {
		int sum = 0;
		while (n > 0) {
			sum += (n % 10);
			n /= 10;
		}
		return sum;
	}

}
