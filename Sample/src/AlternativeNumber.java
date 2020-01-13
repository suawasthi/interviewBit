
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;;
public class AlternativeNumber {

	public static void main(String[] args) {
		Integer arr[] = {  -1, -2, -3, -4, -5};
		System.out.println(alterNative(Arrays.asList(arr))); 
	

	}
	public static List<Integer> alterNative(List<Integer> arr) {
		
		int j=0;
		for(int i=0;i<arr.size();i++) {
			int key=arr.get(i);
			if(key>=0) {
				continue;
			}
			else {
				j=i-1;
				while(j>=0 && arr.get(j) >=0) {
					arr.set(j+1, arr.get(j));
					j--;
				}
				arr.set(j+1, key);
				
			}
			
		}
		int k=0;
		for(int i=0;i<arr.size();i++) {
			if(arr.get(i) >=0) {
				k=i;
				break;
		}
		}
		int l=k;
		if(k==0){
		    return arr;
		}
		for(int i=1;i<=arr.size()-2;i=i+2) {
			int key=0;
			if(arr.get(i)<0 && l< arr.size()) {
				key=arr.get(l);
				l++;
			}
			else {
				break;
			}
			int m=l-2;
			while(m>=i) {
				arr.set(m+1, arr.get(m));
				m--;
			}
			arr.set(i, key);
			
			
			}
				
		return arr;	
		}
		
	}


