package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*initialSet = [p1, p2, p3] 
indexInFinalSet = [0, 0, 0]

for i = 1 to k 
  M = get min from initialSet. 
  add M to the finalAnswer if last element in finalAnswer != M
  if M corresponds to p1 ( or in other words M = initialSet[0] )
    initialSet[0] = finalAnswer[indexInFinalSet[0]] * p1
    indexInFinalSet[0] += 1
  else if M corresponds to p2 ( or in other words M = initialSet[1] )
    initialSet[1] = finalAnswer[indexInFinalSet[1]] * p1
    indexInFinalSet[1] += 1
  else 
    # Similar steps for p3. 
end*/
public class PrimeSequence {

	public static void main(String[] args) {
		System.out.println(solve(2, 3, 5, 10));
	}

	public static ArrayList<Integer> solve(int A, int B, int C, int D) {
        
		ArrayList<Integer> initialSet = new ArrayList<Integer>();
		ArrayList<Integer> finalList = new ArrayList<Integer>();
		initialSet.add(A);
		initialSet.add(B);
		initialSet.add(C);
		int primee[]= new int[3];
		primee[0]=A;
		primee[1]=B;
		primee[2]=C;
		int[] indexInFinalSet = { 0, 0, 0 };

		for (int j = 0; j < D; j++) {

			int M = Collections.min(initialSet);
			finalList.add(M);
		
			for (int i = 0; i < 3; i++) {
				if (M == initialSet.get(i)) {
					initialSet.set(i, finalList.get(indexInFinalSet[i]) *primee[i] );
					indexInFinalSet[i] += 1;
				}
			}

		}
		return finalList;
	
    }

	private static int getNewM(ArrayList<Integer> initialSet, int m) {
		int nextMin = 0;
		ArrayList<Integer> temp = new ArrayList<Integer>(initialSet);
		for (int i = 0; i < initialSet.size(); i++) {
			if (m == initialSet.get(i)) {
				temp.remove(i);
				nextMin = Collections.min(temp);
				initialSet.set(i, nextMin);
				break;
			}
		}
		return nextMin;

	}
}
