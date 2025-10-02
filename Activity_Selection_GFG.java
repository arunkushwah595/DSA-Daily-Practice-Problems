package GFG;

public class Activity_Selection_GFG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] start = { 1, 3, 0, 5, 8, 5 };
		int[] finish = { 2, 4, 6, 7, 9, 9 };
		System.out.println(activitySelection(start, finish));
	}

	private static int activitySelection(int[] start, int[] finish) {
		// TODO Auto-generated method stub
		int[][] arr = new int[start.length][2];
		for (int i = 0; i < arr.length; i++) {
			arr[i][0] = start[i];
			arr[i][1] = finish[i];
		}
		int c = 1;
		int prev = arr[0][1];
		for (int[] a : arr) {
			if (a[0] > prev) {
				prev = a[1];
				c++;
			}
		}

		return c;
	}

}
