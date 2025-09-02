package LEETCODE;

public class Number_of_Provinces_547 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] isConnected = { { 1, 1, 0 }, { 1, 1, 0 }, { 0, 0, 1 } };
		System.out.println(findCircleNum(isConnected));
	}

	public static int findCircleNum(int[][] isConnected) {
		boolean[] isvisited = new boolean[isConnected.length];
		int provinces = 0;
		for (int i = 0; i < isvisited.length; i++) {
			if (!isvisited[i]) {
				hey_recursion(isConnected, isvisited, i);
				provinces++;
			}
		}
		return provinces;
	}

	private static void hey_recursion(int[][] isConnected, boolean[] isvisited, int i) {
		// TODO Auto-generated method stub
		isvisited[i] = true;
		for (int j = 0; j < isvisited.length; j++) {
			if (isConnected[i][j] == 1 && !isvisited[j]) {
				hey_recursion(isConnected, isvisited, j);
			}
		}
	}

}
