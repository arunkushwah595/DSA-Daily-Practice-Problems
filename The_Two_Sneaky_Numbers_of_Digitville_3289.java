package LEETCODE;

public class The_Two_Sneaky_Numbers_of_Digitville_3289 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 7, 1, 5, 4, 3, 4, 6, 0, 9, 5, 8, 2 };
		for (int i : getSneakyNumbers(nums)) {
			System.out.println(i);
		}
	}

	public static int[] getSneakyNumbers(int[] nums) {
		int[] ans = new int[2];
		int idx = 0;
		int[] freq = new int[nums.length - 2];
		for (int i : nums) {
			if (freq[i] == 1) {
				ans[idx++] = i;
				continue;
			}
			freq[i]++;
		}
		return ans;
	}

}
