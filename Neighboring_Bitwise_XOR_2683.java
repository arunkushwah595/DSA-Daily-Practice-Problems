package LEETCODE;

public class Neighboring_Bitwise_XOR_2683 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] derived = { 1, 1, 0 };
		System.out.println(doesValidArrayExist(derived));
	}

	public static boolean doesValidArrayExist(int[] derived) {
		int xor = 0;
		for (int i : derived) {
			xor ^= i;
		}
		return xor == 0;
	}
}
