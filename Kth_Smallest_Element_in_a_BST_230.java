package LEETCODE;

import java.util.ArrayList;

public class Kth_Smallest_Element_in_a_BST_230 {

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
		public int kthSmallest(TreeNode root, int k) {
			ArrayList<Integer> ll = new ArrayList<Integer>();
			inorder(ll, root);
			return ll.get(k - 1);
		}

		public void inorder(ArrayList<Integer> ll, TreeNode root) {
			if (root == null) {
				return;
			}
			inorder(ll, root.left);
			ll.add(root.val);
			inorder(ll, root.right);
		}
	}

}
