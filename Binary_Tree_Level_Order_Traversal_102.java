package LEETCODE;

import java.util.*;

public class Binary_Tree_Level_Order_Traversal_102 {

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

	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> nl = new ArrayList<List<Integer>>();
		if(root==null) {
			return nl;
		}
		int l=0;
		Queue<TreeNode> q = new LinkedList<>();
		q.offer(root);
		while (!q.isEmpty()) {
			int size = q.size();
			List<Integer> ll = new ArrayList<Integer>();
			for (int i = 0; i < size; i++) {
				TreeNode n = q.poll();
				ll.add(n.val);
				if (n.left != null) {
					q.offer(n.left);
				}
				if (n.right != null) {
					q.offer(n.right);
				}
			}
//			if(l%2!=0) {
//				Collections.reverse(ll);     // for Q:103
//			}
			nl.add(ll);
//			l++;   //for Q:103
		}
		return nl;
	}

}
