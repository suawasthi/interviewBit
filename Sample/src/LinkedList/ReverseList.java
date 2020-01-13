package LinkedList;

import java.awt.HeadlessException;

import LinkedList.LinkedList.Node;

public class ReverseList {

	public ReverseList push(ReverseList list, int data) {
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

	public static void print(ReverseList list) {
		Node newNode = list.head;
		while (newNode != null) {
			System.out.println(newNode.data);
			newNode = newNode.next;
		}

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

//1->2->3->4->5->NULL
	// m = 2 and n = 4, return 1->4->3->2->5->NULL
	public static Node reverser(ReverseList list, int start, int end) {
		
		Node dummy = new Node(-1);
        dummy.next = list.head;
        Node pre = dummy;
        Node current = dummy.next;
		int counter = 1;
		while (counter < start) {
			counter++;
			pre = current;
			current = current.next;
		}
		Node node = pre;
		while (counter <= end) {
			Node next = current.next;
			current.next = pre;
			pre = current;
			current = next;
			counter++;

		}
		node.next.next=current;
		node.next=pre;

		
		return dummy.next;

	}

	public static void main(String[] args) {
		ReverseList list = new ReverseList();
		list.push(list, 1);
		list.push(list, 2);
		list.push(list, 3);
		list.push(list, 4);
		list.push(list, 5);
		Node node= reverser(list, 2, 4);
		while (node != null) {
			System.out.print(node.data);
			node = node.next;
		}

	}
}
