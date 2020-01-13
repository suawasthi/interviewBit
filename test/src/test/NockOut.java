package test;

public class NockOut {

	public static void main(String[] args) {
		
		int nos =16;
		
		int carry=0;
		int ans=0;
		while(nos!=1 || carry==1) {
			
			if(nos % 2==0 &&  carry !=0) {
				nos= nos/2;
				nos=nos+carry;
				ans+=nos;
				carry=0;
				continue;
			}
			if((nos + carry) % 2 ==0) {
				nos = (nos+carry)/2;
				ans+=nos;
				carry=0;
			}else {
				nos =(nos-1)/2 ;
				ans+=nos;
				carry=1;
			}
			
			
			
			
			
			
			
		}
		System.out.println(ans);
		
	}

}
