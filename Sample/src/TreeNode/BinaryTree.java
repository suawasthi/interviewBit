package TreeNode;

public class BinaryTree {

	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
			left = null;
			right = null;
		}
	}
	
	static int preOrder=0;
	 public static TreeNode buildTree(int[] A, int[] B) {
	        
	        if(A==null){
	            return null;
	        }
	        if(B==null){
	            return null;
	        }
	        
	        return build(A, B , 0, A.length-1);
	    }
	    
	    public static TreeNode build(int[] pre , int[] in, int instart,int inEnd){
	        
	        if(instart > inEnd){
	            return null;
	        }

			TreeNode node= new TreeNode(pre[preOrder++]);
	            
	        if (instart == inEnd) 
	            return node;
	            
	        int inStrt=search(in ,instart, inEnd, node.val);
	        
	        node.left=build(pre, in ,instart, inStrt-1);
	        node.right=build(pre, in ,inStrt+1, inEnd);
	     
	        return node;   
	    }
	    
	    public static int search(int[] in , int start, int end , int filter){
	        
	        for(int i=start;i<=end;i++){
	            if(in[i]==filter){
	                return i;
	            }
	        }
	        return -99;
	        
	        
	    }
	    public static void main(String[] args) {
	    	int [] A = {  1, 2, 3, 4, 5 };
	    	int[] B = { 3, 2, 4, 1, 5};
	    	
	    	TreeNode n =buildTree(A, B );
		}

}
