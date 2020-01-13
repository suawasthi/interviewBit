import java.util.Arrays;
import java.util.Collections;

public class NextPermutaion {

	public static void main(String[] args) {
		Integer[] i= {4,3,2,1};
		nextPermutation(i);

	}

	public static String nextPermutation(Integer[] i) {
		int j=i.length-1;
		for(;j>0;j--) {
		
				if(i[j]>i[j-1]) {
					break;
				}
		
		}
		if(j-1>0) {
		int key= i[j-1];
		System.out.println("key "+ key);
		int k = i.length-1;
		for (; k >= j; k--) {
			
			if(key < i[k]) {
				break;
			}
		}	
		i[j-1]=i[k];
		i[k]=key;
		
		Arrays.parallelSort(i, j, i.length);
		}
		else 
			Arrays.parallelSort(i);
		
		System.out.println(Arrays.toString(i));
		
		
		
		return null;
	}
	
	
}
