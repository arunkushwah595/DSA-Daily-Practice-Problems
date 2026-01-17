package LEETCODE;

import java.util.HashMap;
import java.util.Map;

public class Number_of_Alternating_XOR_Partitions_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 2, 3, 1, 4 };
		int target1 = 1, target2 = 5;
		System.out.println(alternatingXOR(nums, target1, target2));
	}

	public static int alternatingXOR(int[] nums, int target1, int target2) {
		int MOD = 1000000007;
		Map<Integer, Integer> map1 = new HashMap<>();
		Map<Integer, Integer> map2 = new HashMap<>();

		map1.put(nums[0], 1);

		for (int i = 1; i < nums.length; i++) {
			int num = nums[i];
			Map<Integer, Integer> nmap1 = new HashMap<>();
			Map<Integer, Integer> nmap2 = new HashMap<>();

			for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
				int x = entry.getKey();
				int cnt = entry.getValue();
				nmap1.put(x ^ num, (nmap1.getOrDefault(x ^ num, 0) + cnt) % MOD);
				if (x == target1) {
					nmap2.put(num, (nmap2.getOrDefault(num, 0) + cnt) % MOD);
				}
			}

			for (Map.Entry<Integer, Integer> entry : map2.entrySet()) {
				int x = entry.getKey();
				int cnt = entry.getValue();
				nmap2.put(x ^ num, (nmap2.getOrDefault(x ^ num, 0) + cnt) % MOD);
				if (x == target2) {
					nmap1.put(num, (nmap1.getOrDefault(num, 0) + cnt) % MOD);
				}
			}
			map1 = nmap1;
			map2 = nmap2;
		}
		int ans = 0;
		ans = (ans + map1.getOrDefault(target1, 0)) % MOD;
		ans = (ans + map2.getOrDefault(target2, 0)) % MOD;

		return ans;
	}

}
