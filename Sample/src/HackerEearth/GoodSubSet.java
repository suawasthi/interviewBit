package HackerEearth;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class GoodSubSet {

	public static void main(String[] args) {
		int input[] = { 18 ,2 ,119, 14356 };
		Integer last = null;
		for (int j = 0; j < input.length; j++) {
			 Set<Character> ketList = new HashSet<Character>();
			char[] ch= String.valueOf(input[j]).toCharArray();
			StringBuilder sb = new StringBuilder();
			for (int j1 = 0; j1 < ch.length; j1++) {
				if(ketList.add(Character.valueOf(ch[j1]))) {
					sb.append(Character.valueOf(ch[j1]));
				};
			}
			input[j]=Integer.valueOf(sb.toString());
		}
		performRecsBac(input, last, 0, new ArrayList<Integer>());
		System.out.println(list);
	}

	static ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
	static Set<Character> setList = new HashSet<Character>();


	private static void performRecsBac(int[] input, Integer last, int current, ArrayList<Integer> set) {
		list.add(new ArrayList<Integer>(set));
		if (current >= input.length) {
			return;
		}
		System.out.println(input[current]);
		for (int i = current; i < input.length; i++) {
			char[] ch= String.valueOf(input[i]).toCharArray();
			boolean flag=false;
			for (int j = 0; j < ch.length; j++) {
				if(!setList.add(Character.valueOf(ch[j]))){
					flag=true;
					for (int j2 = j-1; j2 >=0; j2--) {
						setList.remove(Character.valueOf(ch[j2]));
					}
					break;
				}
			}
			if(flag) continue;
			set.add(input[i]);
			performRecsBac(input, input[i], i + 1, set);
			char[] ch1= String.valueOf(set.get(set.size() - 1)).toCharArray();
			for (int j = 0; j < ch1.length; j++) {
				setList.remove(Character.valueOf(ch1[j]));
			}
			set.remove(set.size() - 1);
		}

	}

}
