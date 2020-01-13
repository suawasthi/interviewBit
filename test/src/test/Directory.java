package test;

import java.util.Stack;

public class Directory {
	
	public static void main(String[] args) {
		String a="/a/./b/../../c/";
		System.out.println(simplifyPath(a));
	}
	
	public static String simplifyPath(String A) {
	     String[] st= A.trim().split("/");
	     Stack<String> stack= new Stack<String>();
	     for(int i=1;i<st.length;i++){
	        if(st[i].equals(".")) continue;
	        if(st[i].trim().equals("..")) { if(!stack.isEmpty()){stack.pop();}continue;}
	        stack.push(st[i]);
	     }
	     Stack<String> ans = new Stack<String>();
	     while(!stack.isEmpty()){
	         ans.push(stack.pop());
	     }
	     StringBuilder ans1=new StringBuilder();
	     ans1.append("/");
	     while(!ans.isEmpty()){
	         ans1.append(ans.pop());
	         if(!ans.isEmpty()){
	             ans1.append("/");
	         }
	     }
	     
	    return ans1.toString(); 
	    }

}
