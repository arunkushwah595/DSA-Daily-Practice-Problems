package LEETCODE;

public class Jump_Game_II_45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 2, 3, 1, 1, 4 };
		System.out.println(jump(nums));
	}

	public static int jump(int[] nums) {
		int i = 0, j = 0;
		int jump = 0;
		while (j < nums.length - 1) {
			int max=0;
			for(int k=i;k<=j;k++) {
				max=Math.max(max, i+nums[k]);
			}
			jump++;
			i=j+1;
			j=max;
			
		}

		return jump;
	}

}
