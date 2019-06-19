package com.capgemini;
public class Problem4 {
	public static void main(String[] args) {
		findMajority(new int[]{1,1,1,1,50});
	}
	
	public static void findMajority(int A[]) 
	{ 
		int maxCount = 0;  	//nothing but max count of certain element
		int index = -1;		//index of array
		int N = A.length;	//length of array
		for(int i = 0; i < N; i++) 
		{ 
			int count = 0;
			for(int j = 0; j < N; j++) 
			{ 
				if(A[i] == A[j]) 
					count++; 
			} 
			if(count > maxCount) 
			{ 
				maxCount = count; 
				index = i; 
			} 
		} 
		if (maxCount > N/2) 
			System.out.println("Leader: " + A[index]); 
		else
			System.out.println("No Majority Element (leader)"); 
	} 
}