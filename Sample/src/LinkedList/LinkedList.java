package LinkedList;

import LinkedList.MergeList.ListNode;

public class LinkedList {

	public static void main(String[] args) {

		LinkedList llist = new LinkedList();
		LinkedList llist2 = new LinkedList();
		llist.push(llist, 1);
		llist.push(llist, 22);
		llist.push(llist, 32);
		llist.push(llist2, 2);
		llist.push(llist2, 7);
		llist.push(llist2, 8);
		llist.push(llist2, 64);
		Node lst= mergeTwoLists(llist,llist2);

		/* Create loop for testing */
		System.out.println(llist.head.next.next.next.next.next.next.data);
		System.out.println(llist.head.next.next.data);
		llist.head.next.next.next.next.next.next.next = llist.head.next.next;
		if (detectCycle(llist) == null) {
			Node node=detectCycle(llist) ;
			System.out.println(node.data);
		}
	}
	public static Node mergeTwoLists(LinkedList A1, LinkedList B1) {
		Node dummy = new Node(0);
		Node tail = dummy;
		Node A = A1.head;
		Node B = B1.head;

		while (true) {
			
			if (A == null) {
				tail.next = B;
				break;
			}
			if (B == null) {
				tail.next = A;
				break;
			}

			if (A.data < B.data) {
				tail.next = A;
				A = A.next;
			} else {
				tail.next = B;
				B = B.next;
			}

			 tail=tail.next;
		}

		return dummy.next;
	}

	private static Node detectCycle(LinkedList a) {

		Node slowPtr=a.head;
		Node fastPtr = a.head;
		Node curr = a.head;

	
		while (slowPtr != null && fastPtr != null && fastPtr.next != null) {
			slowPtr = slowPtr.next;
			if (slowPtr.next == null) {
				return null;
			} else {
				if (fastPtr.next.next == null) {
				    return null;
				} else {
					fastPtr = fastPtr.next.next;

				}

			}
			if (slowPtr == fastPtr) {
				break;
			}
		}
		
		if(fastPtr.next == null) {
			return null;
		}
		while (slowPtr.next!=null&&  curr != slowPtr) {
			curr = curr.next;
			slowPtr = slowPtr.next;
		}
		return curr;

	}

	Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}

	}

	public LinkedList push(LinkedList list, int data) {
		Node newNode = new Node(data);
		newNode.next = null;
		if (list.head == null) {
			list.head = newNode;
		} else {
			Node last = list.head;
			while (last.next != null) {
				last = last.next;
			}

			last.next = newNode;
		}
		return list;
	}

	public static void print(LinkedList list) {
		Node newNode = list.head;
		while (newNode != null) {
			System.out.println(newNode.data);
			newNode = newNode.next;
		}

	}

}
