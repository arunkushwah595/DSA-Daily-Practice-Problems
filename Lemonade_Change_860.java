package LEETCODE;

public class Lemonade_Change_860 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] bills = { 5, 5, 5, 10, 10, 20 };

		System.out.println(lemonadeChange(bills));
	}

	public static boolean lemonadeChange(int[] bills) {
		int five = 0;
		int ten = 0;
		for (int i : bills) {
			if (i == 5) {
				five++;
			}

			else if (i == 10) {
				if (five > 0) {
					five--;
					ten++;
				} else {
					return false;
				}
			}

			else {
				if (ten > 0 && five > 0) {
					ten--;
					five--;
				} else if (five > 2) {
					five -= 3;
				} else {
					return false;
				}
			}
		}
		return true;
	}

}
