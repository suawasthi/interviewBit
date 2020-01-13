import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Beggar2 {

	public static void main(String[] args) {

		int A = 10;
		ArrayList<ArrayList<Integer>> B = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> C = new ArrayList<Integer>();
		ArrayList<Integer> D = new ArrayList<Integer>();
		ArrayList<Integer> E = new ArrayList<Integer>();
		ArrayList<Integer> E1 = new ArrayList<Integer>();
		ArrayList<Integer> E2 = new ArrayList<Integer>();
		C.add(1);
		C.add(3);
		C.add(10);

		D.add(6);
		D.add(9);
		D.add(2);

		E.add(3);
		E.add(5);
		E.add(3);
		
		E1.add(2);
		E1.add(8);
		E1.add(4);

		E2.add(6);
		E2.add(7);
		E2.add(5);

	
		B.add(C);
		B.add(D);
		B.add(E);
		B.add(E1);
		B.add(E2);


		
		
		System.out.println(solve(A, B));

	}

	public static ArrayList<Integer> solve(int A, ArrayList<ArrayList<Integer>> B) {

		Integer[] ii = new Integer[A];

		ArrayList<Integer> beggar = new ArrayList<Integer>(Arrays.asList(ii));

		Collections.fill(beggar, 0);

		for (int i = 0; i < B.size(); i++) {

			beggar.set(B.get(i).get(0)-1, beggar.get(B.get(i).get(0)-1) + B.get(i).get(2));
			if(B.get(i).get(1)<A)
			beggar.set(B.get(i).get(1),  beggar.get(B.get(i).get(1)) +     -B.get(i).get(2));
		}
		for (int i = 1; i < beggar.size(); i++) {
			beggar.set(i, beggar.get(i - 1) + beggar.get(i));
		}

		return (ArrayList<Integer>) beggar;
	}

}
