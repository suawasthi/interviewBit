import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;

public class HashMaPSorting {

	public static void main(String[] args) {

		HashMap<Integer, Integer> map = new HashMap();
		map.put(-1, 1);
		map.put(-2, 1);
		map.put(-3, 1);
		map.put(-4, 1);
		map.put(-5, 1);
		map.put(-15, 1);
		map.put(-0, 1);
		
		TreeMap<Integer, Integer> sorted = new TreeMap<>(); 
		sorted.putAll(map);
		
		System.out.println(sorted);
	}

}
