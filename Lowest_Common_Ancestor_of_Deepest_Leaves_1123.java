package LEETCODE;

import java.lang.reflect.Constructor;

public class Lowest_Common_Ancestor_of_Deepest_Leaves_1123 {

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

		class LDP { // lca depth pair
			int d; // depth
			TreeNode lca; // lowest common anchester

			public LDP(int d, TreeNode lca) {
				this.d = d;
				this.lca = lca;
			}
		}

		public TreeNode lcaDeepestLeaves(TreeNode root) {
			return lca(root).lca;
		}

		public LDP lca(TreeNode node) {
			if (node == null) {
				return new LDP(0, null);
			}

			LDP left = lca(node.left);
			LDP right = lca(node.right);

			if (left.d == right.d) {
				return new LDP(left.d + 1, node);
			} 
			else if (left.d > right.d) {
				return new LDP(left.d + 1, left.lca);
			} 
			else {
				return new LDP(right.d + 1, right.lca);
			}

		}

	}

}
