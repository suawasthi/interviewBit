package DP;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class wordBreakII {

	
	public static void main(String[] args) {
		
		String s="pineapplepenapple";
		String[] list = {"apple","pen","applepen","pine","pineapple"};
        Set<String> set= new HashSet<String>();

		for (int i = 0; i < list.length; i++) {
			set.add(list[i]);
		}
		StringBuilder str= new StringBuilder();
		wordBreak(s, set, new ArrayList<String>());
		System.out.println(result);
		
	}
	
	
	static List<String> result = new ArrayList();
	public static boolean wordBreak(String s, Set<String> set, ArrayList<String> str){
        if(s.equals("")) {
             System.out.println(str.toString());
             StringBuilder sb=new StringBuilder();
             for (int i = 0; i < str.size(); i++)  sb =sb.append(str.get(i));
             result.add(sb.toString().trim());
           return false;
        }
        int n=s.length();

        for(int i=1;i<=n ;i++){
            if(set.contains(s.substring(0,i))){ 
                str.add(s.substring(0,i) + " ");
                String s2=s.substring(i);
                if(wordBreak(s2, set, str)){
                return true;
                }else{
                	str.remove(str.size()-1);
                }
            }
        }
        return false;  
    }
}
