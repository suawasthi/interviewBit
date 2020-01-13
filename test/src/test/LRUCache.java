package test;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {

	int lcapacity=0;
    Map<Integer, Integer> map=null;
    public LRUCache(int capacity) {
     map= new LinkedHashMap<Integer, Integer>();   
     lcapacity=capacity;
    }
	public static void main(String[] args) {
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		for (int i = 0; i < args.length; i++) {
			
		}
	}
	public void put(int key, int value) {
        while(map.size()+1 > lcapacity){
            map.remove(map.keySet().iterator().next());  

        }
        map.put(key, value);
    }

}
