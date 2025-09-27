package LEETCODE;

public class LoweBound_UpperBound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 4, 4, 4, 7, 9 };
		for (int i = 0; i <= 10; i++) {
			System.out.println(lowerBound(arr, i));
		}
		System.out.println();
		System.out.println(upperBound(arr, 5));
	}

	public static int lowerBound(int[] arr, int target) {
		int si = 0;
		int ei = arr.length - 1;
		while (si <= ei) {
			int mid = (si + ei) / 2;
			if (arr[mid] == target) {
				ei = mid - 1;
			} else if (arr[mid] < target) {
				si = mid + 1;
			} else {
				ei = mid - 1;
			}
		}
		return si;
	}

	public static int upperBound(int[] arr, int target) {
		int si = 0;
		int ei = arr.length - 1;
		while (si <= ei) {
			int mid = (si + ei) / 2;
			if (arr[mid] > target) {
				ei = mid - 1;
			} else {
				si = mid + 1;
			}
		}
		return si;
	}

}
