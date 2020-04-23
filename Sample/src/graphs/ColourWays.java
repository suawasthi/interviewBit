package graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ColourWays {

	public static void main(String[] args) {

		int color[] = {6,6,6,6,2,2 };

		// Adding edges in the graph
		int input[][] = { { 1, 2 }, { 2, 3 }, { 3, 4 }, { 4, 5}, { 5,6 } };

		HashMap<Integer, Integer> colour = new HashMap<Integer, Integer>();
		for (int i = 0; i < color.length; i++) {
			colour.put(i + 1, color[i]);
		}
		colour.put(-99, 233);
		System.out.println(colour);
		Map<Integer, Integer> parent = new HashMap<Integer, Integer>();
		Map<Integer, ArrayList<Integer>> vertex = new HashMap<Integer, ArrayList<Integer>>();

		for (int i = 0; i < input.length; i++) {
			if (vertex.get(input[i][0]) == null) {
				vertex.put(input[i][0], new ArrayList<Integer>());
			}
			vertex.get(input[i][0]).add(input[i][1]);
			parent.put(input[i][1], input[i][0]);
		}
		parent.put(1, -99);
		int ans = 0;
		System.out.println("parent" + parent);
		Stack<Integer> stack = new Stack<Integer>();
		stack.add(1);
		while (!stack.isEmpty()) {
			int x = stack.pop();
			if (vertex.get(x) != null) {

				ArrayList<Integer> child = vertex.get(x);
				for (int i = 0; i < child.size(); i++) {
					System.out.println(child.get(i) + " child"+ colour.get(child.get(i)));
					System.out.println(child.get(i) + " parent"+ colour.get(parent.get(child.get(i))));
					if (!colour.get(child.get(i)).equals(colour.get(parent.get(child.get(i))))) {
						ans++;
					}
					stack.add(child.get(i));
				}

			}

		}
		System.out.println(++ans);
	}

}
