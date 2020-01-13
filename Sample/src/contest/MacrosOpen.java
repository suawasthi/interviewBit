package contest;

public class MacrosOpen {

	public static void main(String[] args) {

		
		String s= new String("ppiipii");
		String sb = new String();
		System.out.println(makeNode(s, s.length(), 0));
		for (int i = 0; i < s.length(); i++) {}
		//System.out.println(sb.toString());
	}

	static String sb1 = new String();

	public static String makeNode(String sb,int sble, int start) {
		if(sb.charAt(0)=='i') {
			return "Integer";
		}
		for (int i = start; i < sb.length(); i++) {
		  if(sb.charAt(i)=='p') {
			String sub = sb.substring(i);
			String sub2 = sb.substring(i+1);
			String s1=makeNode(sub,sub.length() , i);
			String s2=makeNode(sub2,sub2.length(), i+1);

			
			sb1 ="pair(" + s1+ "," + s2 +")" ;
			//return sb1.toString();
		}
		}
		return sb1.toString();
		
	}
}
