package searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IndexLocation {

	public static void main(String[] args) {

	Integer[] a = {2,5,6,7,7,7,15,16,17,0};
	System.out.println(binarySearch(Arrays.asList(a), 0));
	}
	
	public static int binarySearch(List<Integer> list,Integer target) {
		int low=0;
		int high =list.size()-1;
		while(low <=high) {
			int mid = low + (high-low)/2;
			if(mid+1 < list.size() &&  list.get(mid+1) >= target && list.get(mid) <= target ) return mid+1;
			else if(list.get(mid) > target) high=mid-1;
			else low=mid+1;
		}
		return list.size();
	}

}
