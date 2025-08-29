package LEETCODE;

public class Alice_and_Bob_Playing_Flower_Game_3021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3, m = 2;
		System.out.println(flowerGame(n, m));
	}

	public static long flowerGame(int n, int m) {
		return evod(n, m) + odev(n, m);
	}

	public static long evod(int n, int m) {
		int n_ev = n / 2;
		int m_odd = (m + 1) / 2;
		return (long) n_ev * m_odd;
	}

	public static long odev(int n, int m) {
		int n_odd = (n + 1) / 2;
		int m_ev = m / 2;
		return (long) n_odd * m_ev;
	}

}
