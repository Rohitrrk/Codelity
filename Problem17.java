package com.capgemini;
class Problem17 {  
	public static void main (String[] args) 
	{ 
		int arr[] = {3,5,6,3,3,5};
		System.out.println(solution(arr)); 
	} 
	public static int solution(int A[]) 
	{ 
		int count = 0;    
		for (int P = 0; P < A.length; P++){			
			for (int Q = P+1; Q < A.length; Q++){ 
				if (A[P] == A[Q]){
					count++; 
				}
			}
		}
		return count; 
	} 
}