package test;

public class RegularExpression {

	public static void main(String[] args) {
		
		System.out.println(isMatch("cbccaababcbabac", "c*aab*.*b.b.*.*a*."));
	}

    static String source;
    static String pattern;
    public static boolean isMatch(String s, String p) {
        if(s.equals(p))  return true;
        source=s;
        pattern=p;
        return isMatch(s.length(), p.length()); 
    }
    public static  boolean isMatch(int i, int j){
        if(i <=0 && j <=0) return true;
        if(i<=0) {
        	if(j >=2 && pattern.length() >=2 &&  pattern.charAt(1)=='*') {
        		return isMatch(source, pattern.substring(2));
        	}else {return false;}
        		
        }
        if(j<=0) return false;
            
        if(i > source.length()) return false;
        if(j > pattern.length()) return false;
        if(source.charAt(i-1)==pattern.charAt(j-1) || pattern.charAt(j-1)=='.'){
            return isMatch(i-1, j-1);
        }else if( pattern.charAt(j-1)=='*') {
        	
        	if( pattern.charAt(j-2) != source.charAt(i-1) &&  pattern.charAt(j-2)!='.' ) {
        		return isMatch(i, j-2);	
        	}else {
        		return isMatch(i, j-1) || isMatch(i-1, j) || isMatch(i, j-2);
        	}
        	
        }else {
        	return false;
        }
        
    }

}
