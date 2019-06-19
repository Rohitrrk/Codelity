package com.capgemini;
public class Problem15  
{ 
	public static void main(String[] args) 
	{ 
		String str = "";
		//String str = "(())))(";		
		System.out.println(solution(str)); 
	} 
	public static int solution(String s) { 
	    int closingBracket = 0;
	    int openingBracket = 0;
	    for (int i = 0; i < s.length(); i++) {
	        char c = s.charAt(i);
	        if (c == ')') {
	            closingBracket++;
	        }
	    }
	    for (int i = 0; i < s.length(); i++) {
	        if (openingBracket == closingBracket) {
	            return i;
	        }
	        char c = s.charAt(i);
	        if (c == ')') {
	            closingBracket--;
	        } else if (c == '(') {
	            openingBracket++;
	        }
	    }
	    return -1;
	}
} 