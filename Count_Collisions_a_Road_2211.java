package LEETCODE;

public class Count_Collisions_a_Road_2211 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String directions = "RLRSLL";
		System.out.println(countCollisions(directions));
	}

	public static int countCollisions(String directions) {
		if (directions.length() == 1) {
			return 0;
		}
		int count = 0;
		int i = 0;
		int j = directions.length() - 1;
		while (i < directions.length() && directions.charAt(i) == 'L') {
			i++;
		}
		while (j >= i && directions.charAt(j) == 'R') {
			j--;
		}
		for (int k = i; k <= j; k++) {
			if (directions.charAt(k) != 'S') {
				count++;
			}
		}
		return count;
	}

}
