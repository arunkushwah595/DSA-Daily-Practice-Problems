package Daily_Questions;

public class Find_Missing_and_Repeated_Values_2965 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = { { 1, 3 }, { 2, 2 } };
		for (int i : findMissingAndRepeatedValues(grid)) {
			System.out.println(i);
		}
	}

	public static int[] findMissingAndRepeatedValues(int[][] grid) {
		int n = grid.length;
		int s = n * n;
		int[] ans = {-1,-1};
		int[] freq = new int[s + 1];
		for (int[] arr : grid) {
			for (int i : arr) {
				freq[i]++;
			}
		}
		for (int i = 1; i <= s; i++) {
			if (freq[i] == 2) {
				ans[0] = i;
			} else if (freq[i] == 0) {
				ans[1] = i;
			}
		}
		return ans;
	}

}
