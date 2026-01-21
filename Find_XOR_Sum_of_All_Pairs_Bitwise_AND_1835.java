package LEETCODE;

public class Find_XOR_Sum_of_All_Pairs_Bitwise_AND_1835 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 1, 2, 3 }, arr2 = { 6, 5 };
		System.out.println(getXORSum(arr1, arr2));
	}

	public static int getXORSum(int[] arr1, int[] arr2) {
		int xor1 = 0;
		int xor2 = 0;
		for (int i : arr1) {
			xor1 ^= i;
		}
		for (int i : arr2) {
			xor2 ^= i;
		}
		return xor1 & xor2;
	}

}
