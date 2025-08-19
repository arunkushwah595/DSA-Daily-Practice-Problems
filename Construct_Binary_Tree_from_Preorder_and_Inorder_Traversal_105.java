package lec41;

public class Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal_105 {

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
		public TreeNode buildTree(int[] preorder, int[] inorder) {
			return creatrTree(inorder, preorder, 0, inorder.length - 1, 0, preorder.length - 1);
		}

		public TreeNode creatrTree(int[] in, int[] pre, int ilo, int ihi, int plo, int phi) {
			// plo=preorder lo idx, phi=preorder hi idx, ilo=inorder lo idx
			if (ilo > ihi || plo > phi) {
				return null;
			}

			TreeNode node = new TreeNode(pre[plo]);
			int idx = search(in, ilo, ihi, pre[plo]);
			int c = idx - ilo;
			node.left = creatrTree(in, pre, ilo, idx - 1, plo + 1, plo + c);
			node.right = creatrTree(in, pre, idx + 1, ihi, plo + c + 1, phi);
			return node;
		}

		public int search(int[] in, int ilo, int ihi, int item) {
			for (int i = ilo; i <= ihi; i++) {
				if (in[i] == item) {
					return i;
				}
			}
			return 0;
		}
	}

}
