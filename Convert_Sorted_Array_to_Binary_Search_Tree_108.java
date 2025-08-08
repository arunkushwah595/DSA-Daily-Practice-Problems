package LEETCODE;

public class Convert_Sorted_Array_to_Binary_Search_Tree_108 {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {
		public TreeNode sortedArrayToBST(int[] nums) {
			return Create_Tree(nums, 0, nums.length - 1);
		}

		private TreeNode Create_Tree(int[] in, int si, int ei) {
			if (si > ei) {
				return null;
			}
			int mid = (si + ei) / 2;
			TreeNode nn = new TreeNode();
			nn.val = in[mid];
			nn.left = Create_Tree(in, si, mid - 1);
			nn.right = Create_Tree(in, mid + 1, ei);
			return nn;
		}
	}

}
