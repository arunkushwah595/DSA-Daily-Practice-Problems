package LEETCODE;

public class Smallest_Number_With_All_Set_Bits_3370 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		System.out.println(smallestNumber(n));

	}

	private static int smallestNumber(int n) {
		// TODO Auto-generated method stub
		int ans = 1;
		while (true) {
			if (ans < n) {
				ans = ans * 2 + 1;
			} else {
				return ans;
			}
		}
	}

}
