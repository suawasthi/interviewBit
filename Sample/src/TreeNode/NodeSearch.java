package TreeNode;


//Iterative level order traversal 
//based method to search in Binary Tree 
import java.util.*;

class NodeSearch {

	/*
	 * A binary tree node has data, left child and right child
	 */
	static class node {
		int data;
		node left;
		node right;

		/*
		 * Constructor that allocates a new node with the given data and null left and
		 * right pointers.
		 */
		node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;

		}
	};

//An iterative process to search 
//an element x in a given binary tree 
	static boolean nodeSearch(ArrayList<Integer> in , node root, int x) {
		
		if(root==null) {
			return false;
		}
		in.add(root.data);
		if(root.data==x) {
			return true;
		}
		return nodeSearch(in, root.left, x) || nodeSearch(in, root.right, x);
	}

//Driver code 
	public static void main(String ags[]) {
		System.out.println(Math.ceil(Math.log(20)/ Math.log(2)));
		node NewRoot = null;
		node root = new node(2);
		root.left = new node(7);
		root.right = new node(5);
		root.left.right = new node(6);
		root.left.right.left = new node(1);
		root.left.right.right = new node(11);
		root.right.right = new node(9);
		root.right.right.left = new node(4);
		ArrayList<Integer> in = new ArrayList<Integer>();
		System.out.print((nodeSearch(in , root, 6) ? "Found\n" : "Not Found\n"));
		System.out.print((nodeSearch(in , root, 12) ? "Found\n" : "Not Found\n"));
	Math.pow(a, b)
	}
	
	
	
}

//This code is contributed by Arnab Kundu 
