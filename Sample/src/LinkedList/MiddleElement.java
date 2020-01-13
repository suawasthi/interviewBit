package LinkedList;

import LinkedList.LinkedList.Node;

public class MiddleElement {

	ListNode head;

	class ListNode {
		public int val;
		public ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public static int solve(MiddleElement llist) {
		ListNode slowPtr = llist.head;
		ListNode fastPtr = llist.head;

		if(slowPtr.next==null) {
			return slowPtr.val;
		}
		if(fastPtr.next.next==null) {
			return fastPtr.next.val;
		}
		while (fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
			if (fastPtr==null) {
				return slowPtr.val;
			}
		}

		return slowPtr.val;
	}

	public MiddleElement push(MiddleElement list, int data) {
		ListNode newNode = new ListNode(data);
		newNode.next = null;
		if (list.head == null) {
			list.head = newNode;
		} else {
			ListNode last = list.head;
			while (last.next != null) {
				last = last.next;
			}

			last.next = newNode;
		}
		return list;
	}

	public static void main(String[] args) {
		MiddleElement llist = new MiddleElement();
		llist.push(llist, 1);
		llist.push(llist, 5);


		System.out.println(solve(llist));
	}

}
