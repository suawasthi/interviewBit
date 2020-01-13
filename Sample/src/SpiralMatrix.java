import java.util.ArrayList;

public class SpiralMatrix {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> B = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> C= new ArrayList<Integer>();
		ArrayList<Integer> D= new ArrayList<Integer>();
		ArrayList<Integer> E= new ArrayList<Integer>();
		ArrayList<Integer> F= new ArrayList<Integer>();
		C.add(1);
		C.add(2);
		C.add(3);
		C.add(4);

		D.add(5);
		D.add(7);
		D.add(8);
		D.add(6);
		
		E.add(10);
		E.add(11);
		E.add(12);
		E.add(9);
		
		F.add(13);
		F.add(14);
		F.add(15);
		F.add(16);
		
		B.add(C);
		B.add(D);
		B.add(E);
		B.add(F);
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
