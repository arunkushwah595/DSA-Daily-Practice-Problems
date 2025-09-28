package LEETCODE;

public class Split_Array_With_Minimum_Difference_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 4, 3 };
		System.out.println(splitArray(nums));
	}

	public static long splitArray(int[] nums) {
		int idx = 0;
		long preffixsum = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > nums[i - 1]) {
				preffixsum += nums[i];
				continue;
			} else {
				idx = i;
				break;
			}
		}
		if (idx == 0) {
			idx = nums.length - 1;
			preffixsum -= nums[idx];
			long ans = Math.abs(preffixsum - nums[idx]);
			return ans;
		}

		else {
			for (int i = idx + 1; i < nums.length; i++) {
				if ((nums[i] > nums[i - 1])) {
					return -1;
				}
			}
			long sum = 0;
			for (int num : nums) {
				sum += num;
			}

			long f = (preffixsum * 2) - sum;
			f = Math.abs(f);
			long s = Long.MAX_VALUE;
			if (idx > 1 && nums[idx] != nums[idx - 1]) {
				preffixsum -= nums[idx - 1];
				s = (preffixsum * 2) - sum;
			}
			s = Math.abs(s);
			long ans = Math.min(f, s);
			return ans;
		}
	}

}
