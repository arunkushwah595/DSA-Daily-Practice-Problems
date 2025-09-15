package LEETCODE;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Kth_Largest_Sum_in_a_Binary_Tree_2583 {

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
		public long kthLargestLevelSum(TreeNode root, int k) {
			List<List<Integer>> ll = new ArrayList<List<Integer>>();
			ll = levelOrder(root);
			if (k > ll.size()) {
				return -1;
			}
			PriorityQueue<Long> pq = new PriorityQueue<Long>();
			for (List<Integer> llq : ll) {
				long sum = 0;
				for (int val : llq) {
					sum += val;
				}
				if (pq.size() != k) {
					pq.add(sum);
				} else {
					if (sum > pq.peek()) {
						pq.poll();
						pq.add(sum);
					}
				}

			}
			return pq.peek();
		}

		public List<List<Integer>> levelOrder(TreeNode root) {
			List<List<Integer>> nl = new ArrayList<List<Integer>>();
			if (root == null) {
				return nl;
			}
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
				nl.add(ll);
			}
			return nl;
		}
	}

}
