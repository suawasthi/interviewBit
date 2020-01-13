import java.util.ArrayList;
import java.util.Arrays;

public class ReArrangeArray {

	public static void main(String[] args) {
		int [][] a= {{0,1,2,3},{4,5,6,7}, {8,9,10,11}, {12,13,14,15}};
		for (int i = 0; i < a.length; i++) 
        { 
            for (int j = 0; j < a.length; j++) 
                System.out.print(" " + a[i][j]); 
       
            System.out.print("\n"); 
        } 
		for (int i = 0; i < a.length; i++) 
        { 
            for (int j = 0; j < a.length; j++) 
             //   System.out.print(" " + b[i][j]); 
       
            System.out.print("\n"); 
        } 
		
	}
	public static void reArrange(ArrayList<ArrayList<Integer>> a) {
		int level=0;
		int last= a.get(0).size()-1;
		int row=0;
		while(row <= last-1) {
		for(int i=row;i<last;i++) {
			
			swap(a, new int[] {level,i}, new int[] {i, last});
			swap(a, new int[] {level,i}, new int[] {last, last-i + row});
			swap(a, new int[] {level,i}, new int[] {last-i + row, level});
			
		}
		row++;
		level++;
		last--;
		}
	
	}
	
	public static void swap(ArrayList<ArrayList<Integer>> a, int[] A, int B[])
	{
		int temp = a.get(A[0]).get(A[1]);
		a.get(A[0]).set(A[1], a.get(B[0]).get(B[1]));
		a.get(B[0]).set(B[1], temp);
}
}