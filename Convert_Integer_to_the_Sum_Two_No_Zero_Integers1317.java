package LEETCODE;

public class Convert_Integer_to_the_Sum_Two_No_Zero_Integers1317 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 11;
		for (int i : getNoZeroIntegers(n)) {
			System.out.println(i);
		}
	}

	public static int[] getNoZeroIntegers(int n) {
		for (int i = 1; i < n; i++) {
			int j = n - i;
			if (!String.valueOf(i).contains("0") && !String.valueOf(j).contains("0")) {
				return new int[] { i, j };
			}
		}
		return new int[] {};
	}

}
