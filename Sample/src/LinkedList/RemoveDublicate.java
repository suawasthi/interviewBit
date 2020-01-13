package LinkedList;

import java.util.HashMap;
import java.util.Map;

public class RemoveDublicate {

	static ListNode head;

	static class ListNode {
		public int val;
		public ListNode next;

		ListNode(int data) {
			this.val = data;
			this.next = null;
		}
	}

	public static void main(String[] args) {
		RemoveDublicate list = new RemoveDublicate();
		head = new ListNode(4);
		head.next = new ListNode(4);
		head.next.next = new ListNode(4);
		head.next.next.next = new ListNode(5);
		head.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next = new ListNode(6);
		head.next.next.next.next.next.next = new ListNode(7);
		deleteDuplicates(head);

	}

	public static ListNode deleteDuplicates(ListNode A) {
		ListNode dummy = new ListNode(-1);
		dummy.next = A;

		ListNode p = dummy;
		while (p.next != null && p.next.next != null) {
			if (p.next.val == p.next.next.val) {
				int q = p.next.val;
				while (p.next != null && p.next.val == q) {
					p.next = p.next.next;
				}
			} else
				p = p.next;
		}
		return dummy.next;
	}

}
