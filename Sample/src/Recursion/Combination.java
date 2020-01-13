package Recursion;

public class Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print("121", "", 0);
	}
	
	static int i;
	public static void  print(String str, String osf, int l) {
		System.out.println("OSF:- " + osf);
		System.out.println("str:- " + str);
		if(str.length()==0) {
			System.out.println(osf);
			return;
		}
			char ch= str.charAt(i);
			String rof = str.substring(i);
			print(rof, osf + ch , i);
			print(rof, osf , i);
			i++;
		
		
	}

}
