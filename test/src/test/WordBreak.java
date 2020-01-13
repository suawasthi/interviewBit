package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class WordBreak {

	public static void main(String[] args) {
		List<String> wordDict = new ArrayList<String>();
		//wordDict.add("apple");
		wordDict.add("trainer");
		wordDict.add("my");
		wordDict.add("interview");
		String s="myinterviewtrainer";
		System.out.println(	wordBreak(s, wordDict));
	}
	 static Map<String, Boolean> map= new HashMap<String, Boolean>();
	 static List<Integer> in= new ArrayList<Integer>();
	 public static boolean wordBreak(String s, List<String> wordDict) {
	        
	        HashSet<String> set = new HashSet<String>();
	        HashSet<Integer> index= new HashSet<Integer>();
	        for(int i=0;i<wordDict.size();i++){
	            set.add(wordDict.get(i));
	            index.add(wordDict.get(i).length());
	        }
	        in = index.stream().collect(Collectors.toList());
	        return helperBreaker(s, set, 0);
	        
	        
	    }
	 	static boolean  answered=false;
	    public static boolean helperBreaker(String s, HashSet<String> set, int start){
	    	if(answered) return true;
	    	
	    	if(map.get(s)!=null) return map.get(s);
	    	
	    	if(s.length()==0){
	    		answered=true;
	            return true;
	        }
	       // if(start > s.length()) return true;
	        
	        boolean ans=false;
	        int nos=s.length();
	        for(int i=0;i<in.size();i++){
	        	//System.out.println(s.bstring(0, in.get(i)));
	            if(in.get(i) > nos) {continue;}
	        	if(set.contains(s.substring(0, in.get(i))) && helperBreaker(s.substring(in.get(i)), set, i)){
	            	ans = true
	            	map.put(s.substring(in.get(i)), ans);
	            }
	        }
	        map.put(s, ans);
	        return ans;
	    }

}
