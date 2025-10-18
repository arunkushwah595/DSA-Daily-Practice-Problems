package LEETCODE;

public class Remove_Duplicates_from_Sorted_List_II_82 {

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

	class Solution {
		public ListNode deleteDuplicates(ListNode head) {
			ListNode dum = new ListNode();
			dum.next = head;
			ListNode curr = head;
			ListNode prev = dum;

			while (curr != null) {
				if (curr.next != null && curr.val == curr.next.val) {
					while (curr.next != null && curr.val == curr.next.val)
						curr = curr.next;
					prev.next = curr.next;
					curr = prev.next;
				} else {
					curr = curr.next;
					prev = prev.next;
				}
			}

			return dum.next;
		}
	}

}
