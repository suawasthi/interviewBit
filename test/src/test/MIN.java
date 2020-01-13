package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MIN {

	public static void main(String[] args) {
		int A = 3, B = 4; int [] C = {17742, 4324, 20504, 30549, 4054, 14340};
		System.out.println(nthMagicalNumber(4, 2, 3));
	
	}
	public static int nthMagicalNumber(int N, int A, int B) {
        
	       int lcm = Math.min(A,  B);
	        
	        int counter=1;
	        
	        while(counter <=N){
	            
	        	if(lcm  % A==0 && lcm % B==0) {
	        		counter++;
	        		lcm++;
	        		continue;
	        	}
	            if(lcm  % A==0){
	                counter++;
	                lcm++;
	                continue;
	            }
	            if(lcm % B==0){
	                counter++;
	                lcm++;
	                continue;
	            }
	            if(N<counter) {
	            	lcm++;
	            }
	        }
	        
	        return lcm;
	        
	        
	        
	    }
	    public static int GCD(int A, int B){        
	        if(B==0){
	            return A;
	        }
	        
	        return GCD(B , A%B);
	        
	    }

}
