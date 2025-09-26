package LEETCODE;

public class Bitwise_AND_of_Numbers_Range_201 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int left = 5, right = 7;
		System.out.println(rangeBitwiseAnd(left, right));
	}

	public static int rangeBitwiseAnd(int left, int right) {
		int c = 0;
		while (left < right) {
			left = left >> 1;
			right = right >> 1;
			c++;
		}
		return left << c;
	}

}
