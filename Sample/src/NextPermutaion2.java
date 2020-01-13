import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NextPermutaion2 {

	public static void main(String[] args) {
		Integer[] i= {237 , 542} ;
		ArrayList<Integer> a= new ArrayList<Integer>(Arrays.asList(i));
		nextPermutation(a);

	}

	public static void nextPermutation(ArrayList<Integer> a) {
		int j=a.size()-1;
		for(;j>0;j--) {
		
				if(a.get(j)>a.get(j-1)) {
					break;
				}
		
		}
		if(j-1>=0) {
		int key= a.get(j-1);
		int k = a.size()-1;
		for (; k >= j; k--) {
			
			if(key < a.get(k)) {
				break;
			}
		}	
		a.set(j-1, a.get(k));
		a.set(k,key);
		Integer[] arr = new Integer[a.size()]; 
		  
        // ArrayList to Array Conversion 
        for (int i =0; i < a.size(); i++) 
            arr[i] = a.get(i); 
		 Arrays.parallelSort(arr, j, a.size());
		 for (int i =0; i < a.size(); i++)
			 a.set(i, arr[i]);
		}
		else {
			 Collections.sort(a);
		}
		
			//Arrays.parallelSort();
		
		//System.out.println(Arrays.toString(i));
		
		System.out.println(a);
		
	
	}
	
	
}
