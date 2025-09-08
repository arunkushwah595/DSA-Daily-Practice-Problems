package LEETCODE;

public class Find_N_Unique_Integers_Sum_up_to_Zero_1304 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		for (int i : sumZero(n)) {
			System.out.println(i);
		}
	}

	public static int[] sumZero(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = i * 2 - n + 1;
		return arr;
	}

}
