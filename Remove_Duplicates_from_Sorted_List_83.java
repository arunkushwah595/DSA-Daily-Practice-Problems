package LEETCODE;

public class Remove_Duplicates_from_Sorted_List_83 {

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
			ListNode start = head;
			while (head != null && head.next != null) {
				if (head.val == head.next.val) {
					head.next = head.next.next;
				} else {
					head = head.next;
				}
			}
			return start;
		}
	}

}
