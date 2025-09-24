package LEETCODE;

public class Single_Element_in_a_Sorted_Array_540 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };
		System.out.println(singleNonDuplicate(nums));
	}

	public static int singleNonDuplicate(int[] nums) {
		return find_single(nums);
	}

	public static int find_single(int[] arr) {
		int n = arr.length;
		if (n == 1) {
			return arr[0];
		}
		int si = 0, ei = n - 1;

		while (si <= ei) {

			int mid = (si + ei) / 2;

			if (mid == 0) {
				return arr[0];
			}

			else if (mid == n - 1) {
				return arr[n - 1];
			}

			else {
				if (arr[mid] != arr[mid + 1] && arr[mid] != arr[mid - 1]) {
					return arr[mid];
				} 
				else if ((arr[mid] == arr[mid - 1]) && (mid - 1) % 2 == 0) {
					si = mid + 1;
				}
				else if ((arr[mid] == arr[mid - 1]) && (mid - 1) % 2 != 0) {
					ei = mid - 1;
				}
				else if (mid % 2 == 0) {
					si = mid + 1;
				}
				else {
					ei = mid - 1;
				}
			}
		}
		return 0;
	}
}
