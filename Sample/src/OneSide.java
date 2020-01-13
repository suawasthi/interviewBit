import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OneSide {
	public static void main(String[] args) {
		Integer [] a = { 34, 8, 14, 71, 78, 62, 0, 0, 84, 64, 0, 43};
		System.out.println(solve((List<Integer>) Arrays.asList(a)));
	
	}
	
    public static List<Integer> solve(List<Integer> A) {
        //int j=A.size()-1;
        ArrayList<Integer> myList = new ArrayList<Integer>(Collections.nCopies(A.size(), 0));
        int j=0;
        for(int i=0;i<A.size();i++){
        	if(A.get(i)!=0) {
        		myList.set(j, A.get(i));
        		j++;
        	}
        	
        }
        
        return myList;
        
    }


}
