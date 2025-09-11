package LEETCODE;

public class Stone_Removal_Game_3360 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=24;
		System.out.println(win(n));
	}
	public static boolean win(int n) {
		int c=0;
		int x=10;
		while(n>=0) {
			n-=x;
			x-=1;
			c++;
		}
		if(c%2==0) {
			return true;
		}
		return false;
	}

}
