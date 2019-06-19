package com.capgemini;
public class Problem12 {
	public static void main(String[] args) {
		solution("w232111esdfsd23qwgggggggerw2cwwwwwwes");
	}
	public static void solution(String testString){
		//split 
		String[] s = testString.split("[0-9]");	//RE
		int length = 0;			int index = -1;	
		for(int i=0; i< s.length; i++){
			if(s[i].matches("[a-z]*.*[A-Z].*[a-z]*")){	//RE
				if(length <= s[i].length()){
					length = s[i].length();
					index = i;
				}   }	}
		
		if(index >= 0)   System.out.println(s[index].length());
		else System.out.println("password not found");		
	}
}