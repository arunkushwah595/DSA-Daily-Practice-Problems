package LEETCODE;

public class Maximum_Value_of_an_Ordered_Triplet_II_2874 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1000000,1,1000000};
		System.out.println(maximumTripletValue(nums));
	}

	public static long maximumTripletValue(int[] nums) {
//		long maxTriplet = 0, maxNum = 0, maxDiff = 0;
//		for (int i : nums) {
//			maxTriplet = Math.max(maxTriplet, maxDiff * i);
//			maxNum = Math.max(maxNum, i);
//			maxDiff = Math.max(maxNum - i, maxDiff);
//		}
//		return maxTriplet;
		
		int[] pref_max=new int[nums.length];
		int[] suff_max=new int[nums.length];
		
		int prev=nums[0];
		for (int i = 0; i < suff_max.length; i++) {
			pref_max[i]=Math.max(prev, nums[i]);
			prev=pref_max[i];
		}
		
		int next=nums[nums.length-1];
		for (int i = nums.length-1; i >=0; i--) {
			suff_max[i]=Math.max(next, nums[i]);
			next=suff_max[i];
		}
		
		long ans=0;
		for (int i = 1; i < nums.length-1; i++) {
			ans=Math.max(ans,(long) (pref_max[i-1]-nums[i])*suff_max[i+1]);
		}
		return ans;
	}

}
