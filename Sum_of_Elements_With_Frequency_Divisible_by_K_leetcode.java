package Practice;

import java.util.HashMap;

public class Sum_of_Elements_With_Frequency_Divisible_by_K_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 4, 4, 4, 1, 2, 3 };
		int k = 3;
		System.out.println(sumDivisibleByK(nums, k));
	}

	public static int sumDivisibleByK(int[] nums, int k) {
		HashMap<Integer, Integer> freq = new HashMap<>();

		for (int num : nums) {
			freq.put(num, freq.getOrDefault(num, 0) + 1);
		}

		int sum = 0;

		for (int num : freq.keySet()) {
			if (freq.get(num) % k == 0) {
				sum += num * freq.get(num);
			}
		}

		return sum;
	}

}
