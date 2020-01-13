import java.util.ArrayList;

public class Sample {
	public static void main(String[] args) {
		System.out.println(generateMatrix(3));
	}

    public static ArrayList<ArrayList<Integer>> generateMatrix(int A) {
        ArrayList<Integer> L= new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
       for(int i=1;i<=A*A;i++) {
			
			if(i%A==0) {
				L.add(0);
				a.add(L);
				L= new ArrayList<Integer>();
				continue;
			}
			L.add(0);
		}
		
		
		
		ArrayList<Integer> sp= new ArrayList<Integer>();
		int rowend= a.get(0).size()-1;
		int rowStart=0;
		int colStart =0;
		int colEnd = a.size()-1;
		int z=1;
		while(colStart<=colEnd) {
		for(int i= colStart ; i<=colEnd ;i++) {
			//sp.add(a.get(rowStart).get(i));
			a.get(rowStart).set(i,z);
			z++;
		}
		rowStart++;
	
		for(int i=rowStart;i<=rowend;i++) {
			//sp.add(a.get(i).get(colEnd));
			a.get(i).set(colEnd, z++);
		}
		
		colEnd--;
		for (int i = colEnd; i >=colStart; i--) {
		//	sp.add(a.get(rowend).get(i));
			a.get(rowend).set(i, z++);
			
		}
		rowend--;
		for (int i = rowend; i >=rowStart; i--) {
			//sp.add(a.get(i).get(colStart));
			a.get(i).set(colStart, z++);
			
		}
		colStart++;
		}
            
	return a;	

    }


}
