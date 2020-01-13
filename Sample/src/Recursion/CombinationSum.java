package Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CombinationSum {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(1);
		A.add(2);
		A.add(1);
	
		System.out.println(combinationSum(A, 28));
	}

	public static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B) {

		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		if (A.size() == 0 | A == null) {
			return result;
		}

		Collections.sort(A);
		List<Integer> canidate = A.stream().distinct().collect(Collectors.toList());
		List<Integer> CSF = new ArrayList<Integer>();
		toFindCombination(canidate, CSF, 0, B, result);
		return result;

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
			combinationsOp.add(canidateIn.get(i));
			toFindCombination(canidateIn, combinationsOp, i, (targertNowC - canidateIn.get(i)), resultOp);
			combinationsOp.remove(combinationsOp.size() - 1);

		}

	}
}
