package TreeNode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

// Definition for binary tree
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
		left = null;
		right = null;
	}
}

public class LastNode {
	
	
	public TreeNode solve(TreeNode A) {

		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(A);
		Deque<TreeNode> deque = null;
		while (!queue.isEmpty()) {
			int size = queue.size();
			deque = new LinkedList<TreeNode>();
			for (int i = 0; i < size; i++) {
				TreeNode temp = queue.poll();
				if (temp.left != null) {
					queue.offer(temp.left);
					deque.add(temp.left);
				}
				if (temp.right != null) {
					queue.offer(temp.right);
					deque.add(temp.right);
				}

			}
		}
		System.out.println(deque.pollFirst());
		System.out.println(deque.pollLast());

		return null;

	}
}
