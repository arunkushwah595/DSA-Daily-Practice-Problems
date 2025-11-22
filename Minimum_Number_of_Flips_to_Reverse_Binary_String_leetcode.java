package LEETCODE;

public class Minimum_Number_of_Flips_to_Reverse_Binary_String_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		System.out.println(minimumFlips(n));
	}

	public static int minimumFlips(int n) {
		String s = Integer.toBinaryString(n);
		int i = 0;
		int j = s.length() - 1;
		int c = 0;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				c++;
			}
			i++;
			j--;
		}

		return c * 2;
	}
}
