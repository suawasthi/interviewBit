package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hiuyt {

	public static void main(String[] args) {

		 int A[] = {20, 14, 8, 18, 6 };
		 int B[] = {1, 16, 7, 6, 17, 3, 13, 8, 19, 20 };
		 solve(A,B);
	}

    public static int[] solve(int[] A, int[] B) {
        
        int[] ans =new int[A.length];
        Map<Integer, List<Integer>> map = new  HashMap();
        for(int i=0;i<A.length;i++){
            if(map.get(A[i])==null){
                map.put(A[i] ,new  ArrayList<Integer>());
            }
            map.get(A[i]).add(i);
        }
        int count=0;
        for(int i=0;i<B.length;i++){
            
            if(map.get(B[i])!=null){
                List<Integer> set = map.get(B[i]);
                for(int j=0;j<set.size();j++){
                    ans[count++]=   A[set.get(j)];
                    A[set.get(j)]= -A[set.get(j)];
                }
            }
        }
        
        
        for(int i=0;i<A.length;i++){
            if(A[i] >= 0){
                ans[count++]=A[i];
            }
        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }


}
