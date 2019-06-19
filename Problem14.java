package com.capgemini;
class Problem14 
{
	public static void main(String args[]) 
	{ 
		System.out.print("Total number bits set to 1: ");
		System.out.print(solution(7,3)); 
	} 
	public static int solution(int A, int B) 
	{ 
		int n = A*B;		//step 1 
		int count = 0;		//counting number of 1
		while (n > 0) 
		{
			count = count + ( n & 1 );	//bitwise  AND
			n >>= 1; 					//right shifting		
		} 
		return count; 
	} 
}