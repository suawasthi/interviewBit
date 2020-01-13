package Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CombinationSumUnique {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(8);
		A.add(10);
		A.add(6);
		A.add(11);
		A.add(1);
		A.add(16);
		A.add(8);
		// 10,1,2,7,6,1,5
		// 8, 10, 6, 11, 1, 16, 8 
		System.out.println(combinationSum(A, 28));
	}

	public static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B) {

		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		if (A.size() == 0 | A == null) {
			return result;
		}

		Collections.sort(A);
		// List<Integer> canidate = A.stream().distinct().collect(Collectors.toList());
		List<Integer> CSF = new ArrayList<Integer>();
		toFindCombination(A, CSF, 0, B, result);
		Set<ArrayList<Integer>> uniqueGas = new HashSet<ArrayList<Integer>>(result);
		ArrayList<ArrayList<Integer>> result1 = new ArrayList<ArrayList<Integer>>(uniqueGas);

		return result1;
		

	}

	private static void toFindCombination(List<Integer> canidateIn, List<Integer> combinationsOp, int startI,
			int targertNowC, ArrayList<ArrayList<Integer>> resultOp) {
		if (targertNowC == 0) {
			resultOp.add(new ArrayList<Integer>(combinationsOp));
			return;
		}

		for (int i = startI; i < canidateIn.size(); i++) {

			if (canidateIn.get(i) > targertNowC) {
				break;
			}
		//	if (checkCombination(combinationsOp, canidateIn.get(i) , i)) {
				combinationsOp.add(canidateIn.get(i));
				toFindCombination(canidateIn, combinationsOp, i+1, (targertNowC - canidateIn.get(i)), resultOp);
				combinationsOp.remove(combinationsOp.size() - 1);
			//}

		}

	}

	private static boolean checkCombination(List<Integer> combinationsOp, Integer toBeAdded, int start) {
		for (int i = start; i < combinationsOp.size(); i++) {
			if (combinationsOp.get(i).equals(toBeAdded)) {
				return false;
			}
		}
		return true;
	}

	private static boolean possible(List<Integer> combinationsOp, int l, int curr) {
		for (int i = l; i < curr; i++)
			if (combinationsOp.get(i) == combinationsOp.get(curr))
				return true;
		return true;
	}
}
