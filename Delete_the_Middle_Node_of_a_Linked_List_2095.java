package LEETCODE;

public class Delete_the_Middle_Node_of_a_Linked_List_2095 {

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

	public ListNode deleteMiddle(ListNode head) {
		if (head == null || head.next == null) {
			return null;
		}
		ListNode slow = head;
		ListNode fast = head;
		ListNode prev = null;

		while (fast != null && fast.next != null) {
			prev = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		prev.next = slow.next;
		slow.next = null;
		return head;
	}

}
