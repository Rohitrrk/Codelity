package com.capgemini;
class Problem9 
{
    public static void main(String[] args)  
    { 
        int mat[][] = {
        		{4, 5, 6},
        		{7, 18, 9},
        		{5, 1, 3}       		   
        		  };
        solution(mat);
    }      
    public static void solution(int[][] A)
    {
    	int max, min, x, f = 0;
    	
		for (int i = 0; i < A.length; i++) {
			min = A[i][0]; 
			x = 0;
			for (int j = 0; j < A[i].length; j++) {
				if (A[i][j] < min) {
					min = A[i][j];
					x = j; 							
				}
			}
			max = A[0][x]; 
			for (int k = 0; k < A.length; k++) {
				if (A[k][x] > max) {
					max = A[k][x];
				}
			}	
			if (max == min) {
				System.out.println("Saddle point = " + max);
				f = 1;		//kind of flag which indicates 
							//if loop is executed or not
			}
		}
		if (f == 0) {
			System.out.println("No saddle point");
		}
    }
} 