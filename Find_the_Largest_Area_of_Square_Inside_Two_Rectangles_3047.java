package LEETCODE;

public class Find_the_Largest_Area_of_Square_Inside_Two_Rectangles_3047 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] bottomLeft = { { 1, 1 }, { 2, 2 }, { 3, 1 } };

		int[][] topRight = { { 3, 3 }, { 4, 4 }, { 6, 6 } };
		System.out.println(largestSquareArea(bottomLeft, topRight));
	}

	public static long largestSquareArea(int[][] bottomLeft, int[][] topRight) {
		int l = 0; // length of sqaure
		for (int i = 0; i < topRight.length; i++) {
			for (int j = i + 1; j < topRight.length; j++) {
				int xmin = Math.max(bottomLeft[i][0], bottomLeft[j][0]);
				int xmax = Math.min(topRight[i][0], topRight[j][0]);
				int ymin = Math.max(bottomLeft[i][1], bottomLeft[j][1]);
				int ymax = Math.min(topRight[i][1], topRight[j][1]);

				if (xmin < xmax && ymin < ymax) {
					int len = Math.min(xmax - xmin, ymax - ymin);
					l = Math.max(l, len);
				}
			}
		}
		return (long) l * l;

	}

}
