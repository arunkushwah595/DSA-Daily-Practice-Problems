package LEETCODE;

public class Delete_Columns_to_Make_Sorted_II_955 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = { "xc", "yb", "za" };
		System.out.println(minDeletionSize(strs));
	}

	public static int minDeletionSize(String[] strs) {
		int c = 0;
		boolean[] visited = new boolean[strs.length];
		for (int col = 0; col < strs[0].length(); col++) {
			boolean del = false;
			for (int i = 1; i < visited.length; i++) {
				if (!visited[i] && strs[i].charAt(col) < strs[i - 1].charAt(col)) {
					del = true;
					break;
				}
			}
			if (del) {
				c++;
				continue;
			}
			for (int i = 1; i < visited.length; i++) {
				if (strs[i].charAt(col) > strs[i - 1].charAt(col)) {
					visited[i] = true;
				}
			}
		}
		return c;
	}

}
