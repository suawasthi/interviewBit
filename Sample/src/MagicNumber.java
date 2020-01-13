
public class MagicNumber {

	public static void main(String[] args) {

		int A=10;
		int result=1;
				int pow=1;
			int res=0;
		while(A!=0) {
			pow = pow *5;
			if((int)(A&1)==1) {
				res+=pow;
			}
			
			
			A>>=1;
			
		}
		
		
		
		System.out.println(res);
	}

}
