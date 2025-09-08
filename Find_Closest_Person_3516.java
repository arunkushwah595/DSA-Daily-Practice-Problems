package LEETCODE;

public class Find_Closest_Person_3516 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 2, y = 7, z = 4;
		System.out.println(findClosest(x, y, z));
	}

	public static int findClosest(int x, int y, int z) {
		if (Math.abs(x - z) == Math.abs(y - z)) {
			return 0;
		}
		if (Math.abs(x - z) > Math.abs(y - z)) {
			return 2;
		}
		return 1;
	}

}
