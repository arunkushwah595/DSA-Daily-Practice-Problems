package LEETCODE;

public class Minimize_XOR_2429 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 3, num2 = 5;
		System.out.println(minimizeXor(num1, num2));
	}

	public static int minimizeXor(int num1, int num2) {
		int set_bit = 0;
		while (num2 > 0) {
			num2 = (num2 & (num2 - 1));
			set_bit++;
		}
		int x = 0;
		for (int i = 30; i >= 0; i--) {
			int mask = (1 << i);
			if ((num1 & mask) != 0) {
				x |= mask;
				set_bit--;
				if (set_bit == 0) {
					return x;
				}
			}
		}
		for (int i = 0; i < 31; i++) {
			int mask = (1 << i);
			if ((num1 & mask) == 0) {
				x |= mask;
				set_bit--;
				if (set_bit == 0) {
					return x;
				}
			}
		}
		return x;
	}

}
