import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Power {
	public static void main(String[] args) {
		ArrayList<Integer> arry = new ArrayList<Integer>();
		arry.add(0);
		arry.add(0);
		arry.add(2);
		arry.add(2);
		arry.add(4);
		arry.add(4);
		arry.add(4);
		arry.add(6);
		arry.add(6);
		arry.add(6);

		System.out.println(removeDuplicates(arry));

	}

	public static  int removeDuplicates(ArrayList<Integer> a) {
		if (a.size() <= 1)
			return a.size();
		int count=0;
		ArrayList<Integer>  toBeRemoved = new  ArrayList<Integer>();
		for (int i = 1; i < a.size(); i++) {
			if(a.get(i).equals(a.get(i-1))) {
				toBeRemoved.add(i);
			
			}
			
		}
		
		ListIterator<Integer> iter= a.listIterator();
		while(iter.hasNext()) {
			
			while( iter.hasNext() && iter.next() == iter.next() ) {
					{
					iter.remove();
					}
			}
			
		}
	
		System.out.println(a);
		return count;

	}
}
