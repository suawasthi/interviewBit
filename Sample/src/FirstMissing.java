import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstMissing {

	public static void main(String[] args) {
		Integer[] a= {2};
		System.out.println(firstMissingPositive(Arrays.asList(a)));

	}

    public static int firstMissingPositive(List<Integer> A) {
        
    	int zero=0;
        for(int i=0;i<A.size();i++){
        	
        	int key= A.get(i);
        	if(key>=0) {
        		continue;
        	}
        	int j=i;
        	while(j>zero) {
        		A.set(j, A.get(j-1));
        		j--;
        	}
        	A.set(zero, key);
        	zero++;
        }
        if(zero>0) {
        for(int i=zero;i<A.size();i++){
            int x = Math.abs(A.get(i)); 
            if(x - 1 < A.size()-zero && A.get(x - 1+zero) > 0) 
	        	A.set(x-1+zero, (-A.get(x+zero-1)));
        }
        }
        int result=0;
        for(int i=zero;i<A.size();i++){
        if(A.get(i)>=0){
            result = i-zero+1; 
            break;
        }
        else  if(i==A.size()-zero-1) {
        	result = A.size()-zero+1;
        }
        }
        
        return A.size()-zero==0 ? 1 : result;
        
    }
    
    public static List<Integer> getPositiveInteger(List<Integer> a){
        
      int zero=0;
        for(int i=0;i<a.size();i++){
        	
        	int key= a.get(i);
        	if(key>=0) {
        		continue;
        	}
        	int j=i;
        	while(j>zero) {
        		a.set(j, a.get(j-1));
        		j--;
        	}
        	a.set(zero, key);
        	zero++;
        }
        System.out.println(zero);
        return a;
    }


}
