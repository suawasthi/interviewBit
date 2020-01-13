package Greedy;

public class BinayString {

	public static void main(String[] args) {

        int B=3;
        String A="00010110";
        char[] stChr= A.toCharArray();
        int ans=0;
        for(int i=0;i<=stChr.length-B;i++){
            System.out.println(stChr[i]);
            if(stChr[i]=='0'){
            	ans++;
                System.out.println("Inside");
                int k=B-1;
                while(k >=0){
                    if(stChr[i+k]=='1')
                    {
                        stChr[i+k]='0';
                    }
                    else{
                        stChr[i+k]='1';
                    }
                    k--;
                }
            }
        }
        for (int i = 0; i < stChr.length; i++) {
			 if(stChr[i]=='1'){
				 continue;
			 }else {
				 System.out.println("-1");
			 }
		}
        
        System.out.println(ans);
    
		
	}
}
