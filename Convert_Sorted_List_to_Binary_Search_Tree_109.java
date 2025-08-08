package LEETCODE;

import java.util.ArrayList;

public class Convert_Sorted_List_to_Binary_Search_Tree_109 {

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

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
		public TreeNode sortedListToBST(ListNode head) {
			ArrayList<Integer> ll = new ArrayList<Integer>();
			name(head, ll);
			return Create_Tree(ll, 0, ll.size() - 1);
		}

		public void name(ListNode head, ArrayList<Integer> ll) {
			if (head == null) {
				return;
			}
			ll.add(head.val);
			name(head.next, ll);
		}

		private TreeNode Create_Tree(ArrayList<Integer> ll, int si, int ei) {
			if (si > ei) {
				return null;
			}
			int mid = (si + ei) / 2;
			TreeNode nn = new TreeNode();
			nn.val = ll.get(mid);
			nn.left = Create_Tree(ll, si, mid - 1);
			nn.right = Create_Tree(ll, mid + 1, ei);
			return nn;
		}
	}

}
