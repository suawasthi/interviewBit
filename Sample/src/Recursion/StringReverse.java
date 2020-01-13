package Recursion;

public class StringReverse {

	public static void main(String[] args) {
		char[] c= {'a', 'b', 'c'};
		reverse(c, 0, c.length-1);
	}

	    public static char[] reverse(char[] s , int i , int j) {
	        
	        if(i >= j){
	            return s;
	        }else{
	            char temp= s[i];
	            s[i]=s[j];
	            s[j]=temp;
	            reverse(s, ++i, --j);  
	        }  
	        
	        return null;
	    
	    }

}
