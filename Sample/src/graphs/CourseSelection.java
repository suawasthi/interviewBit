package graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class CourseSelection {

	public static void main(String[] args) {
		int A = 5;
		int[][] B = { { 1, 3},{ 4, 5 }, { 2, 1} ,{5, 3 } };
		canFinish(A, B);

	}

	private static void performDFS(Set<Integer> visSet, HashMap<Integer, Integer> map, Stack<Integer> currentElement) {

		while (!currentElement.isEmpty() && !visSet.contains(currentElement)) {
			int cur = currentElement.pop();
			visSet.add(cur);
			if (map.get(cur) != null) {
				currentElement.add(map.get(cur));
			}
		}
	}

	public static boolean canFinish(int numCourses, int[][] prerequisites) {
		if (numCourses <= 0)
			return false;
		Queue<Integer> queue = new LinkedList<>();
		int[] inDegree = new int[numCourses+1];
		for (int i = 0; i < prerequisites.length; i++) {
			inDegree[prerequisites[i][1]]++;
		}
		for (int i = 1; i < inDegree.length; i++) {
			if (inDegree[i] == 0)
				queue.offer(i);
		}
		while (!queue.isEmpty()) {
			int x = queue.poll();
			for (int i = 0; i < prerequisites.length; i++) {
				if (x == prerequisites[i][0]) {
					inDegree[prerequisites[i][1]]--;
					if (inDegree[prerequisites[i][1]] == 0)
						queue.offer(prerequisites[i][1]);
				}
			}
		}
		for (int i = 0; i < inDegree.length; i++) {
			if (inDegree[i] != 0)
				return false;
		}
		return true;
	}
}
