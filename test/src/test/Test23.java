package test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test23 {
	
	private static final int[] A = null;
	public static void main(String[] args) {
		Integer[] A1= { 1000, 1000, 1000, 1000, 1001, 1002, 1003, 1003, 1004, 1010 };
		int B [] = {   1, 12, 14, 17, 18, 18, 27, 31, 31, 32, 33, 38, 39, 45, 46, 46, 47, 49, 50, 54, 54, 55, 56, 58, 61, 65, 65, 67, 68, 70, 72, 75, 76, 79, 80, 81, 84, 88, 88, 88, 89, 90, 94, 96, 96, 98, 100 };
		int C [] = { 2, 3, 4, 5, 5, 6, 7, 7, 9, 10, 17, 22, 24, 27, 27, 30, 31, 33, 33, 36, 37, 40, 41, 43, 45, 45, 47, 47, 48, 51, 54, 54, 54, 61, 65, 65, 67, 67, 68, 68, 74, 76, 80, 81, 86, 87, 90, 92, 95, 97, 97, 98, 98, 98, 101};
		//intersect(B, C);
		int[] d= {1,2,3,4};
		int [][] ad= {{74},
		            {66}
		            };
		String str="3e1.1";
		int[] in = { 2,3,5,7,11};
		ArrayList<Integer> arr= new ArrayList<Integer>();
		ArrayList<Integer> arrb = new ArrayList<Integer>();
		arr.add(-4);
		arr.add(3);
		arrb.add(-2);
		arrb.add(-2);
		merge(arr,arrb);
	}
	
	
	public static int  candy(int[] A) {
        Arrays.sort(A);
       // for(int i=0;i<A.length;i++)
           // System.out.println(A[i]);
        int candy[]=new int[A.length];
        int sum=1;
        candy[0]=1;
        for(int i=1;i<A.length;i++)
        {
            if(A[i]>A[i-1])
                candy[i]=candy[i-1]+1;
            else if(A[i]==A[i-1])
                candy[i]=candy[i-1];
            sum+=candy[i];
        }
        return sum;
    }
	public static int[] intersect(final int[] A, final int[] B) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        
        int n=13+1;
        int ans1[]=new int[n];
        long factorial[]= new long[n+1];
        factorial[0]=1;
       // int
        for(int i=1;i < factorial.length;i++) {
            factorial[i]= factorial[i-1] *i;   
        }
        for (int i = 0; i < n; i++) {
            ans1[i]= (int) (factorial[n-1]/(factorial[i] * factorial[n-i-1]));
        }
        System.out.println(Arrays.toString(ans1));
        return ans1;
        //return new int[] {-1,-1};
     
    }

	static int  performBinarySearch(int[] A, int low, int high, int key) {
		 if(low==high-1) { 
			 //return -1;
			 System.out.println();
			 }
	   
		//if(low >= A.length) return -1;
		int ans=-1;
		while(low <=high) {
			
			int mid = (low + high)/2;
			if(A[mid]==key) {
				ans=mid;
				high= mid-1;
			}
			if(A[mid] < key) {
				low= mid+1;
			}else {
				high=mid-1;
			}
			
		}
		return ans;
		
		
		
	}
	public static int isNumber(final String A) {
        String B=A.trim();
        boolean exp=false;
        boolean dot=false;
        if(B.length()==0) return 0;
        for(int i=0;i<B.length();i++){
            int ch = (int) B.charAt(i);
             //System.out.println(ch);
            if(ch >= 48 && ch <=57 || ch==69 || ch ==101 || ch==46){
                if(ch ==101){
                    exp=true;
                }
                if(ch==46 ){
                    if(!dot){
                    dot=true;
                    } else{return 0;}
                    if(exp) {return 0;}
                }
                    
                continue;
            }
            return 0;
        }
        return 1;
        
    }   
	public static int solve(final int[] A) {
        Map<Integer, Integer> map[] = new Map[A.length];
        int res=Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++){
            map[i]=new HashMap<Integer, Integer>();    
            for(int j=0;j<=i;j++){
                int diff = A[i]-A[j];
                if(map[j].get(diff)!=null){
                    map[i].put(diff, map[j].get(diff) +1);           
                }else{
                    map[i].put(diff, 1);
                }
                res = Math.max(res, map[i].get(diff));
            }
        }
        return res;
    }
	
	 
    public static int isPossible(int [] nums, int mid){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            double d= nums[i]/mid;
            sum += Math.ceil(d);
        }  
        System.out.println(mid+ "::"+sum);
        return sum;
      
    }
    public  static void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
	    int aCurrent=0;
	    int bCurrent=0;
	    int m= a.size();
	    int n=b.size();
	    ArrayList<Integer> arrayList= new ArrayList<Integer>();
	    while(true){
	            System.out.println(a.get(aCurrent)  + " inside " + b.get(bCurrent));
	        if(a.get(aCurrent) > b.get(bCurrent)){
	            arrayList.add(b.get(bCurrent++));
	        }
	        else{
	            arrayList.add(a.get(aCurrent++));
	        }
	        
	        if(aCurrent > m-1) {break;}
	        if(bCurrent > n-1) {break;}
	        
	        
	    }
	    while(aCurrent <m){
	        arrayList.add(a.get(aCurrent++));
	    }
	    while(bCurrent <n){
	        arrayList.add(b.get(bCurrent++));
	    }
	    a=arrayList;
	}
	public static int maxcoin(int[] A) {
	      return maxCoin(A, 0, 0, 0 , A.length-1); 
	    }
	    static int chosen=0;
	    static int notChosen=0;
	    public static int maxCoin(int[] A, int sum , int currentSize, int nextstart, int end){
	        int n =A.length;
	        if(nextstart > A.length) {return sum;}
	        if(nextstart==end){
	            return sum;
	        }
	        if(currentSize==A.length/2) return sum;
	        
	        
	        chosen=maxCoin(A, sum + (Math.max(A[nextstart], A[end])), currentSize+1, nextstart+1, end-1);
	        notChosen=maxCoin(A, sum + (Math.max(A[nextstart], A[end])), currentSize+1, nextstart+1, end-1);
	        
	        return Math.max(chosen, notChosen);
	    }
}
