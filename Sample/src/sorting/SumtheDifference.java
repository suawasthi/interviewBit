package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SumtheDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public int solve(ArrayList<Integer> A) {
	
    	Collections.sort(A);
    	long min_sum = 0, max_sum = 0; 
    	for (int i = 0; i < A.size(); i++) {
			
    		min_sum= 2* min_sum+ A.get(i);
    		min_sum = min_sum % 1000000007;
    		max_sum= 2*max_sum + A.get(A.size()-1-i);
    		max_sum=max_sum%1000000007;
		}
    	
    	return   (int) ((max_sum-min_sum+ 1000000007) %1000000007);
    }

}
