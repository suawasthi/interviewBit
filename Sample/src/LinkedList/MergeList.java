package LinkedList;

public class MergeList {

	public static void main(String[] args) {
		MergeList firstList = new MergeList();
		firstList.push1(firstList, 5);
		firstList.push1(firstList, 8);
		firstList.push1(firstList, 20);
		MergeList secondList = new MergeList();
		secondList.push1(secondList, 4);
		secondList.push1(secondList, 11);
		secondList.push1(secondList, 15);

		mergeTwoLists(firstList, secondList);
	}

	ListNode firstHead;

	static class ListNode {
		public ListNode next;
		public int val;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public MergeList push1(MergeList list, int data) {
		ListNode newNode = new ListNode(data);
		newNode.next = null;
		if (list.firstHead == null) {
			list.firstHead = newNode;
		} else {
			ListNode last = list.firstHead;
			while (last.next != null) {
				last = last.next;
			}

			last.next = newNode;
		}
		return list;
	}

// 4 5 8 11 15 20
	public static ListNode mergeTwoLists(MergeList A1, MergeList B1) {

		ListNode dummyNode = new ListNode(-1);
		ListNode trailNode=dummyNode;
		ListNode A=A1.firstHead;
		ListNode B= B1.firstHead;
		while(true) {
		if (A == null) {
			trailNode.next=B;
			break;
		}
		if (B == null) {
			trailNode.next=A;
			break;
		}
		
		if(A.val < B.val) {
			trailNode.next=A;
			A=A.next;
		}else {
			trailNode.next=B;
			B=B.next;
		}
		
		trailNode=trailNode.next;
		
		}
		return dummyNode.next;
	}

}
