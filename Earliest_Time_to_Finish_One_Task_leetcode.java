package LEETCODE;

public class Earliest_Time_to_Finish_One_Task_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] tasks = { { 1, 6 }, { 2, 3 } };
		System.out.println(earliestTime(tasks));
	}

	public static int earliestTime(int[][] tasks) {
		// TODO Auto-generated method stub
		int ans = Integer.MAX_VALUE;
		for (int[] arr : tasks) {
			int s = arr[0];
			int t = arr[1];
			ans = Math.min(ans, s + t);
		}
		return ans;
	}

}
