import java.util.ArrayList;

public class ReverserBits {

	public static void main(String[] args) {
		//long l1=3L;
		int l=3;
		int times =32;
		int reslt = 0;
		java.util.List<Integer> list= new ArrayList<Integer>();
		while(times>0) {
			int b= l &1;
			list.add(b);
			l=l>>1;
		times--;
		}
		System.out.println(list);
		
		for(int i=0;i<list.size();i++) {
			reslt= reslt <<1 | list.get(i);
		}
		System.out.println(reslt);
	}

}
