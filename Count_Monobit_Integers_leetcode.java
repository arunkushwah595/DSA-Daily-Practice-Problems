package LEETCODE;

public class Count_Monobit_Integers_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int countMonobit(int n) {
		int c = 0;
		int i = 0;
		while (Math.pow(2, i) - 1 <= n) {
			c++;
			i++;
		}
		return c;
	}

}
