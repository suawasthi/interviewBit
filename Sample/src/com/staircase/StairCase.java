package com.staircase;

public class StairCase {

	public static void main(String[] args) {
		System.out.println(climb(6)); 
		
	}
	static int b=2;
	static int c=b;
	static Boolean bo=true;
	public static int climb(int n) {
		System.out.println(n);
		if(b==0) {
			bo=false;
		}
		if(n==1 || n==0) {
			b=c;
			bo=true;
			return 1;
		}
		if(n==2  ) {
			b=c;
			bo=true;
			return 2;
		}
	
		
		return bo== true ?  climb(n-1) + climb(n-2) +  climb(n-3): climb(n-1) + climb(n-2);
		
		
		
	}
	

}
