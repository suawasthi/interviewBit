package LinkedList;

public class FlatternList {

	Node head;
	
	class ListNode 
    { 
        int data; 
        ListNode right, down; 
        ListNode(int data) 
        { 
            this.data = data; 
            right = null; 
            down = null; 
        } 
    } 
	
	ListNode flatten(ListNode root) {
		if(root==null && root.right ==null) {
			return root;
		}
		
		root.right=flatten(root.right);
		
		root= merge(root, root.right);
		
		return root;
	 
		
		
		
	}

	private ListNode merge(ListNode secondLst, ListNode last) {
		
		if(last==null) 
			return secondLst;
		
		if(secondLst==null) {
			return last;
		}
		
		ListNode result=null;
		
		if(secondLst.data < last.data) {
			result=secondLst;
			result.down=merge(secondLst.down, last);
		}else {
			result =last;
			result.down=merge(secondLst, last.down);
		}

		return result;
	}
  
	
}
