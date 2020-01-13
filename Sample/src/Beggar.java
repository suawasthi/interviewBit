import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Beggar {

	public static void main(String[] args) {
	
		int A = 5;
		ArrayList<ArrayList<Integer>> B = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> C= new ArrayList<Integer>();
		ArrayList<Integer> D= new ArrayList<Integer>();
		ArrayList<Integer> E= new ArrayList<Integer>();
		C.add(1);
		C.add(2);
		C.add(10);
		
		D.add(2);
		D.add(3);
		D.add(20);
		
		E.add(2);
		E.add(5);
		E.add(25);
		
		B.add(C);
		B.add(D);
		B.add(E);
		
		
		System.out.println(solve(A, B));

	}
	public static ArrayList<Integer> solve(int A, ArrayList<ArrayList<Integer>> B) {
	
		Integer[] ii = new Integer[A];
		ArrayList<Integer> beggar = new ArrayList<Integer>(Arrays.asList(ii));
		
		Collections.fill(beggar,0 );

		
		for(ArrayList<Integer> frm : B) {
			
			int start=frm.get(0)-1;
			int end = frm.get(1)-1;
			int element = frm.get(2);
			
			for(int i=start;i<=end;i++) {
				beggar.set(i, (beggar.get(i)+ element));
			}
			
		}
		
		
		return (ArrayList<Integer>) beggar; 
	}


}
