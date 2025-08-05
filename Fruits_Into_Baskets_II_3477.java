package Daily_Questions;

public class Fruits_Into_Baskets_II_3477 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] fruits = { 4, 2, 5 }, baskets = { 3, 5, 4 };
		System.out.println(numOfUnplacedFruits(fruits, baskets));
	}

	public static int numOfUnplacedFruits(int[] fruits, int[] baskets) {
		int up = 0; // unplaced
		for (int fruit : fruits) {
			boolean isplaced = false;
			for (int i = 0; i < baskets.length; i++) {
				if (fruit <= baskets[i]) {
					isplaced = true;
					baskets[i] = 0;
					break;
				}
			}
			if (!isplaced) {
				up++;
			}
		}
		return up;
	}

}
