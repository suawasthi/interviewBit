
public class OverLapping {
	 public static int solve(int A, int B, int C, int D, int E, int F, int G, int H) {
	 
		 
		 if(A >= G || B >= H )  
			{return 0;}
				 
		if(C <= E   || D <= F )
			return 0;
		
		 return 1;
	 }
	 
	 public static void main(String[] args) {
		   int  A = 0   ,B = 0;
		   int  C = 1  , D = 1;
		   int  E = 1  , F = 1;
		   int  G = 6 ,  H = 6;
		   
		  
		System.out.println(solve(A, B, C, D, E, F, G, H));
		 
	}

}
