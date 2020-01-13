import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Factors {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(32);
		
		System.out.println(solve(A));

	}

	public static ArrayList<Integer> solve(ArrayList<Integer> A) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		for (int i = 0; i < A.size(); i++) {
			res.add(solve(A.get(i)));
		}

		return res;
	}

	public static int solve(int n) {
        int cnt = 0; 
        while()

        return cnt; 
        
	}

	public static int getSmallcut(int n) {

		int[] siev = new int[n + 1];
		for (int i = 0; i <= n; i++)
			siev[i] = 1;
		if (n == 1 | n == 2) {
			return n;
		}
		for (int p = 2; p * p <= n; p++) {
			if (siev[p] == 1) {
				for (int i = p * p; i <= n; i += p)
					siev[i] = 0;
			}
			if (siev[n] == 0) {
				return p;
			}
		}
		return n;

	}

}
