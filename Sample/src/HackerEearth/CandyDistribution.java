package HackerEearth;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CandyDistribution {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int nos = s.nextInt();
        long[] input = new long[nos];
        int[] people= new int[nos];
        for(int i=0;i<nos;i++){
            input[i]=s.nextLong();
            people[i]=s.nextInt();
        }
        s.close();
        for(int i=0;i<nos;i++){
            if(input[i] > people[i]){
               
                if(people[i] ==1 ){
                    System.out.println("0");
                    continue;
                }
                if((long)people[i] == input[i]){
                    System.out.println("0");
                    continue;
                }
                
                System.out.println(performBinaySearch(input[i], people[i]));
            }else{
                System.out.println(input[i]);
            }
        }

	}
	
	

	static Long performBinaySearch(Long totalNo, int noPeople) {
		Long ans = totalNo;
		Long low = 0L;
		Long high = totalNo;
		while (high-low >=1) {
			Long mid = (low + high) / 2;
			if (mid <= 0) {
				return ans;
			}
			Long mid1 = isPosible(mid, noPeople);
			if (totalNo - mid1 == 0)
				return 0L;
			if (mid1 < totalNo) {
				ans = Math.min(ans, totalNo - mid1);
				low = mid ;
			} else {
				high = mid;
			}
		}

		return ans;
	}

	static Long[] arr;

	private static Long isPosible(Long mid, int noPeople) {
		long nextNumber =mid;
		long ans=0;
		try {
			Long firstNumer = 2 * nextNumber;
			ans = (noPeople) *(firstNumer+  (noPeople-1)* 1)/2;
		}catch(Exception ex) {
			return Long.MAX_VALUE;
		}
		return ans;
	}

}
