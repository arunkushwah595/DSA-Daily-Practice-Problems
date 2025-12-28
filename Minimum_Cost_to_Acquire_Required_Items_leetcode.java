package LEETCODE;

public class Minimum_Cost_to_Acquire_Required_Items_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cost1 = 3, cost2 = 2, costBoth = 1, need1 = 3, need2 = 2;
		System.out.println(minimumCost(cost1, cost2, costBoth, need1, need2));
	}

	public static long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
		if (costBoth >= cost1 + cost2) {
			return (long) cost1 * need1 + (long) cost2 * need2;
		}
		long min_need = Math.min(need1, need2);
		long c = 0;
		c += (long) costBoth * min_need;
		c += (long) (need1 - min_need) * cost1;
		c += (long) (need2 - min_need) * cost2;
		long bc = (long) costBoth * Math.max(need1, need2);
		return Math.min(c, bc);
	}

}
