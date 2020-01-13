package LinkedList;

public class Palindrome {

	static ListNode head;

	static class ListNode {
		ListNode next;
		int val;

		ListNode(int val) {
			this.val = val;
			this.next = null;
		}
	}

	public static void main(String[] args) {

		Palindrome list = new Palindrome();
		list.push(list, 2);

	
	
		System.out.println(solve(list));
	}

	public static boolean solve(Palindrome list) {

		ListNode slowPtr = list.head;
		ListNode fastPtr = list.head;

		while (fastPtr!=null && fastPtr.next != null) {
			slowPtr = slowPtr.next;
			if (fastPtr.next != null) {
				fastPtr = fastPtr.next.next;
			} else {
				break;
			}
		} // odd len
		
		if (fastPtr != null) { slowPtr = slowPtr.next; }
		 
		ListNode toBe = slowPtr;
		slowPtr = null;

		ListNode dummy = new ListNode(-1);
		dummy.next = toBe;
		ListNode current = toBe;

		ListNode pre = null;
		while (current != null) {
			ListNode next = current.next;
			current.next = pre;
			pre = current;
			current = next;

		}

		while (pre != null) {
			if (head.val == pre.val) {
				head = head.next;
				pre = pre.next;
			} else {
				return false;
			}
		}
		return true;
	}

	public static Palindrome push(Palindrome list, int data) {

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

}
