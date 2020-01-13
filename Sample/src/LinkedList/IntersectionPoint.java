package LinkedList;

public class IntersectionPoint {

	ListNode head;
	ListNode head2;

	static class ListNode {
		int data;
		ListNode next;

		ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static void main(String[] args) {
		IntersectionPoint list = new IntersectionPoint();
		IntersectionPoint list2 = new IntersectionPoint();


		// creating first linked list
		list.head = new ListNode(3);
		list.head.next = new ListNode(6);
		list.head.next.next = new ListNode(9);
		list.head.next.next.next = new ListNode(15);
		list.head.next.next.next.next = new ListNode(30);

		// creating second linked list
		list2.head = new ListNode(10);
		list2.head.next = new ListNode(15);
		list2.head.next.next = new ListNode(30);

		ListNode ans=getIntersectionNode(list, list2);

	}

	public static ListNode getIntersectionNode(IntersectionPoint a1, IntersectionPoint b1) {
		ListNode a =a1.head;
		ListNode b=b1.head;
		int m = length(a);
		int n = length(b);
		if(n>m) {
			//return getIntersectionNode(b, a);
		}
		
		int d =m-n;
		
		for (int i = 0; i < d; i++) {
			a=a.next;
			
		}
		
		while (a !=null && b!=null) {

			if(a==b) {
				return a;
			}
			a=a.next;
			b=b.next;
		}
		return null;
	}

	private static int length(ListNode a) {

		int count = 0;
		while (a != null) {
			count++;
			a = a.next;
		}

		return count;
	}

	public IntersectionPoint push(IntersectionPoint list, int data) {
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

}
