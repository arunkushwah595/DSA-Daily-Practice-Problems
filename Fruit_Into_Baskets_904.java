package LEETCODE;

import java.util.HashMap;

public class Fruit_Into_Baskets_904 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] fruits = { 3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4 };
		System.out.println(totalFruit(fruits));
	}

	public static int totalFruit(int[] fruits) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int si = 0;
		int ei = 0;
		int ans = 0;
		while (ei < fruits.length) {

			map.put(fruits[ei], map.getOrDefault(fruits[ei], 0) + 1);

			while (map.size() >= 3) {
				map.put(fruits[si], map.get(fruits[si]) - 1);
				if (map.get(fruits[si]) == 0) {
					map.remove(fruits[si]);
				}
				si++;
			}
			ans = Math.max(ans, ei - si + 1);
			ei++;
		}
		return ans;
	}

}
