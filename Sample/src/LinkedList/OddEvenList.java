package LinkedList;

public class OddEvenList {

	static ListNode head;

	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {

		head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next = new ListNode(6);
		oddEvenList(head);

	}

	public static ListNode oddEvenList(ListNode head) {
		ListNode oddList = head;

		ListNode evenNode = head.next;
		ListNode evenHead = evenNode;

		while (oddList.next != null && evenNode.next != null) {
			evenNode.next =oddList.next;
			evenNode=evenNode.next;
			oddList.next=evenNode.next;
			oddList=oddList.next;
			
		}
		oddList.next=evenHead;
		return head;
	}
}
