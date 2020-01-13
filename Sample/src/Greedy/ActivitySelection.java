package Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {

	public static void main(String[] args) {

		 int [] A = {17, 8, 14, 24, 10, 8, 1, 30};
		 int [] B = {18, 45, 24, 27, 18, 10, 38, 35};
		 pair[] p= new pair[B.length];
		 for (int i = 0; i < B.length; i++) {
			 p[i]= new pair(A[i], B[i]);
			
		}
		 new Comparator<T>() {
		};
		 
		Arrays.sort(p, new Comparator<pair[]>(){
			
			
			
		}); 
		Arrays.sort(p, new Comparator< pair>() {

			@Override
			public int compare( pair o1,  pair o2) {
				return o1.y-o2.y;
			}
		}) ;
		
	}
	static class pair{
		
		int x;
		int y;
		
		pair(int x, int y){
			this.x=x;
			this.y=y;
		}
	}

}
