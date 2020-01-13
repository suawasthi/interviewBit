import java.util.LinkedList;
import java.util.Queue;

public class Prime {

	public static void main(String[] args) {
		// 67 -> 9 -> 70 -> 84 -> 57 -> 51 -> 26 -> 14 -> 95 -> 95 -> 61 -> 36 -> 1 
		ListNode root;
		root= new ListNode(67);
		root.next= new ListNode(9);
		root.next.next= new ListNode(70);
		root.next.next.next=new ListNode(84);
		root.next.next.next.next=new ListNode(57);
		root.next.next.next.next.next=new ListNode(51);
		root.next.next.next.next.next.next=new ListNode(26);
		root.next.next.next.next.next.next.next=new ListNode(14);
		root.next.next.next.next.next.next.next.next=new ListNode(95);
		root.next.next.next.next.next.next.next.next.next=new ListNode(61);
		root.next.next.next.next.next.next.next.next.next.next=new ListNode(36);
		root.next.next.next.next.next.next.next.next.next.next.next=new ListNode(1);

		

		ListNode  node =solve(root);
		while(node.next!=null) {
			System.out.println(node.val);
			node= node.next;
		}
		//System.out.println(isPrime(30));
	}

	//56 
	public static Integer getSum(int num) {
		int sum=0;
		while(num!=0) {
			sum+= num%10;
			num =  num/10;
		}	
		return sum;
	}
	
	public static boolean isPrime(Integer num) {
		if(num >= 0 && num <2) {
			return false;
		}
		
		int sq= (int)Math.sqrt(Math.abs(num));
		for (int i = 2; i <=sq; i++) {
			if(num %i ==0) {
				return false;
			}
		}
		return true;
	}
	static class ListNode {
		      public int val;
		      public ListNode next;
		      ListNode(int x) { val = x; next = null; }
		  }
public static ListNode solve(ListNode A) {
        
        ListNode normalHead = new ListNode(0);
        normalHead.next=A;
        ListNode counter= A;
        ListNode pre=null;
        int count=0;
        Queue<ListNode> node = new LinkedList<ListNode>();
        Queue<ListNode> nPnode = new LinkedList<ListNode>();

        
        while(A!=null) {
        	
        	if(isPrime(getSum(A.val))) {
        		node.offer(A);
        	}else {
        		nPnode.offer(A);
        		
        	}
        	A=A.next;
        }
       
      while(!nPnode.isEmpty()) {
    	 node.offer(nPnode.poll());
      }
      ListNode res= new ListNode(0);
      ListNode res1;
      
      res1=node.poll();
      res=res1;
      res1.next=null;
      while(!node.isEmpty()) {
    	  
    	  while(res1.next!=null) {
    		  res1=res1.next;
    	  }
    	  ListNode temp= node.poll();
    	  res1.next=temp;
    	  temp.next=null;
 ;
 
      }
        
        
       return res;
   
        
       
        
    }
}
