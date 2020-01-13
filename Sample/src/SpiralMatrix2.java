import java.util.ArrayList;

public class SpiralMatrix2 {

	public static void main(String[] args) {
		
		ArrayList<ArrayList<Integer>> B = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> L= new ArrayList<Integer>();
		
		for(int i=1;i<=9;i++) {
			
			if(i%3==0) {
				L.add(i);
				B.add(L);
				L= new ArrayList<Integer>();
				continue;
			}
			L.add(i);
		}
		
		
		
		printSpiral(B);
	}
	public static  void printSpiral(ArrayList<ArrayList<Integer>> a) {
		System.out.println(a);
		ArrayList<Integer> sp= new ArrayList<Integer>();
		int rowend= a.get(0).size()-1;
		int rowStart=0;
		int colStart =0;
		int colEnd = a.size()-1;
		
		while(colStart<=colEnd) {
		for(int i= colStart ; i<=colEnd ;i++) {
			sp.add(a.get(rowStart).get(i));
		}
		rowStart++;
	
		for(int i=rowStart;i<=rowend;i++) {
			sp.add(a.get(i).get(colEnd));
		}
		
		colEnd--;
		for (int i = colEnd; i >=colStart; i--) {
			sp.add(a.get(rowend).get(i));
			
		}
		rowend--;
		for (int i = rowend; i >=rowStart; i--) {
			sp.add(a.get(i).get(colStart));
			
		}
		colStart++;
		}
		System.out.println(sp);
		
	}

}
