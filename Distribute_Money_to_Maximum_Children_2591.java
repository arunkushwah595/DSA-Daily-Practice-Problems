package LEETCODE;

public class Distribute_Money_to_Maximum_Children_2591 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int money = 20, children = 3;
		System.out.println(distMoney(money, children));
	}

	public static int distMoney(int money, int children) {
		if (money < children) {
			return -1;
		}
		money -= children;
		int c = 0;
		while (children > 0 && money >= 7) {
			money -= 7;
			c++;
			children--;
		}
		if (c == 0) {
			return 0;
		}
		if (children == 0 && money > 0) {
			c--;
		}
		if (money == 3 && children == 1) {
			c--;
		}
		return c;
	}

}
