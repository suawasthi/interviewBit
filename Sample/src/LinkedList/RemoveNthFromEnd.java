package LinkedList;

import LinkedList.LinkedList.Node;

public class RemoveNthFromEnd {

	static ListNode head;

	static class ListNode {
		public int val;
		public ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public static ListNode removeNthFromEnd(RemoveNthFromEnd A, int B) {
		int b = B;
		ListNode fastPtr = A.head;
		while (--b > 0 && fastPtr != null) {
			fastPtr = fastPtr.next;
		}
		ListNode slowptr = A.head;
		while (fastPtr != null) {
			fastPtr = fastPtr.next;
			if (fastPtr!=null && fastPtr.next != null) {
				slowptr = slowptr.next;
			}
		}
		if(slowptr==head && head!=null && b==0) {
			ListNode newNode= head.next;
			head=newNode;
			return head;
		}
		else if (slowptr.next != null && b==0) {
			slowptr.next = slowptr.next.next;
			return head;
		}
		else {
			ListNode newNode= head.next;
			head=newNode;
			return head;
		}

		
	}

	public static RemoveNthFromEnd push(RemoveNthFromEnd list, int data) {
		
		
		ListNode newNode = new ListNode(data);
		newNode.next = null;
		if (head == null) {
			list.head = newNode;
		} else {
			ListNode last = head;
			while (last.next != null) {
				last = last.next;
			}

			last.next = newNode;
		}
		return list;
	}

	public static void print_ll() {
		ListNode temp = head;

		while (temp != null) {
			System.out.print(temp.val);
			if (temp != null) {
				System.out.print(" ");
				temp = temp.next;

			}
		}
	}

	public static void main(String[] args) {

		RemoveNthFromEnd llist = new RemoveNthFromEnd();
		llist.push(llist, 1);
		llist.push(llist, 2);
		llist.push(llist, 3);
		llist.push(llist, 4);
		llist.push(llist, 5);
	
		print_ll();
		ListNode node= removeNthFromEnd(llist, 1);
		while(node!=null) {
			System.out.println("Returned List");

			System.out.print(node.val);
			node=node.next;
		}
		//print_ll();
	}
}
