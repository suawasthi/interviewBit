package LinkedList;

public class Linked {

	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}

	}

	public static void remove(int position) {

		Node nodetrac = head;

		int pos = position - 1;
		while (pos > 0 && nodetrac != null) {

			pos--;

			if (pos != 0) {
				nodetrac = nodetrac.next;

			}
		}
		if ((pos == 0 && position != 1)) {

			nodetrac.next = nodetrac.next.next;

		}
		else if ((pos == 0 && position == 1 && head!=null)) {

			Node newnode=head.next;
			head=newnode;

		}
	}

	public static void insert_node(int position, int value) {

		Node newNode = new Node(value);
		Node nodetrac = head;

		int pos = position - 1;
		while (pos > 0 && nodetrac != null) {
			if (nodetrac.next == null) {
				nodetrac.next = newNode;
				pos = -999;
				break;
			}
			pos--;
			if (pos != 0) {
				nodetrac = nodetrac.next;
			}

		}
// newNode.next = node.next;
		// node.next = newNode;
		if ((pos == 0 && position != 1)) {

			newNode.next = nodetrac.next;
			nodetrac.next = newNode;

		}
		if (position == 1 && head == null) {
			head = newNode;
		} else if (position == 1 && head.next != null) {
			newNode.next = head;
			head = newNode;
		}

	}

	public static void print_ll() {
		Node temp = head;

		while (temp != null) {
			System.out.print(temp.data);
			if (temp != null) {
				System.out.print(" ");
				temp = temp.next;

			}
		}
	}

	public static void main(String[] args) {
		insert_node(1, 23);
	

		print_ll();

		remove(1);
		System.out.println("asf");
		print_ll();

	}

}
