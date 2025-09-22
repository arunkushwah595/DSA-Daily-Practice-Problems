package LEETCODE;

public class Count_Elements_With_Maximum_Frequency_3005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 2, 3, 1, 4 };
		System.out.println(maxFrequencyElements(nums));
	}

	public static int maxFrequencyElements(int[] nums) {
		int[] freq = new int[100];
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for (int i : nums) {
			freq[i - 1]++;
			if (freq[i - 1] > max) {
				max = freq[i - 1];
				sum = freq[i - 1];
			} else if (freq[i - 1] == max) {
				sum += freq[i - 1];
			}
		}
		return sum;
	}

}
