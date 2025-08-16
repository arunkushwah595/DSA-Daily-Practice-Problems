package LEETCODE;

public class Best_Time_to_Buy_and_Sell_Stock_121 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {7,1,5,3,6,4};
		System.out.println(maxProfit(arr));

	}
	
	public static int maxProfit(int[] arr) {
		int buy=arr[0];
		int profit=0;
		for (int i = 1; i < arr.length; i++) {
			if(buy>arr[i]) {
				buy=arr[i];
			}
			else if(arr[i]-buy>profit) {
				profit=arr[i]-buy;
			}
		}
		return profit;
	}

}
