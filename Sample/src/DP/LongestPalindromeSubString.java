package DP;

import java.util.ArrayList;
import java.util.List;

public class LongestPalindromeSubString {

	public static void main(String[] args) {

		longestPalindrome("abkba",1);
	}
	
	public static String longestPalindrome(String s, int Kl){
		   boolean dp[][] = new boolean[s.length()][s.length()];
	        String result = new String();
	         int len =s.length(); 
	        if(s.length()!=0) result =String.valueOf(s.charAt(0));
	        for(int i=0;i<len;i++) {
	        	dp[i][i]=true;
	        	}
	        
	        boolean b=true;
		/*
		 * for(int i=1;i<len;i++){ if(s.charAt(i-1) ==s.charAt(i)){ if(b) { result
		 * =s.substring(i-1, i+1); b=false; } dp[i-1][i]=true; } }
		 */
	        int counter=0;
	        boolean f=true;
	       
	        for(int i=1;i<len;i++)
	        {
	            counter=0;
	            for(int j=0;j<len && counter <len-i ;j++){
	          //  System.out.println(i-1 + "--i--j-- "+j+1 + " dp[j+`]" + dp[j+1][i-1]);

	                if((dp[j+1][j+i-1]  ||  i + j -counter < 3 ) && s.charAt(counter)==s.charAt(i+j)) {
	                  //  Systemout.println(j +"--j -i --" + i + "--Counter--" + s.charAt(counter)  +"--Schat--"+ s.charAt(i+j));
	                    if(f){
	                    result = s.substring(counter, i+j+1);
	                    f=false;    
	                    }
	                    dp[j][i+j]=true;
	                }
	            counter++;
	            }
	          f=true;
	        }
	        System.out.println(result);
	        return result;
	    
	}

}
