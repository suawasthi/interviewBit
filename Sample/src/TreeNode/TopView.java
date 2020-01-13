package TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class TopView {
	
	 //Definition for binary tree
	
	static TreeNode node;
	
	 static class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) {
	       val = x;
	       left=null;
	       right=null;
	     }
	  }

	public static void main(String[] args) {
		//17 29 10 15 28 28 29 4 4 -1 -1 -1 -1 -1 -1 -1 -1 -1 
		node= new TreeNode(17);
		node.left=new TreeNode(29);
		node.right=new TreeNode(10);
		node.left.left= new TreeNode(15);
		node.left.right= new TreeNode(28);
		node.right.left= new TreeNode(28);
		node.right.right= new TreeNode(29);
		node.left.left.left= new TreeNode(4);
		node.left.left.right= new TreeNode(4);

		solve(node);
	}
    public static ArrayList<Integer> solve(TreeNode A) {
        
       ArrayList<Integer> result= new ArrayList<>();
        
        if(A ==null){
            return result;
        }
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        Queue<Integer> hdqueue = new LinkedList<Integer>();

        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        
        queue.add(A);
        hdqueue.add(0);
        ArrayList<Integer> node = new ArrayList<Integer>();
        node.add(A.val);
      //  map.put(0, node);
        Integer min =Integer.MAX_VALUE;
        Integer max=Integer.MIN_VALUE;
        while(!queue.isEmpty()){
           //  Map<Integer,List<Integer>> tmp = new HashMap();
            int cnt = queue.size();
            for(int i=0;i<cnt;i++){
            TreeNode temp = queue.poll();
            int hd= hdqueue.poll();
            

            if(!map.containsKey(hd)) {
            	map.put(hd, new ArrayList<Integer>());
            	map.get(hd).add(temp.val);
            }
            min= Math.min(min, hd);
            max=Math.max(max, hd);     
                
           
            
            if(temp.left!=null){
                queue.add(temp.left);
                hdqueue.add(hd-1);
              
            }  
            if(temp.right!=null){
                queue.add(temp.right);
                hdqueue.add(hd+1);  
            }
            }
         
       
        
        }
       
        
        
        for(int i=min ;i<=max;i++){
            ArrayList<Integer> list= map.get(i);
          
            result.add(list.get(0));
        }
        
        
        
        

        return result;
        
    }


}
