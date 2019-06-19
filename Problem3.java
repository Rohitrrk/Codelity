package com.capgemini;

public class Problem3 {
	public static void main(String[] args) {
		System.out.println("Total multiplicative pair: ");
		int A[] = new int[]{0, 1, 2, 2, 3, 5};
		int B[] = new int[]{500000, 500000, 0, 0,0, 20000};
		System.out.println("Count: "+ solution(A, B));
	}

	public static int solution(int A[], int B[]){
		int count = 0;
		double C[] = new double[A.length];
		for(int i=0;i<A.length;i++)
		{
			C[i]=(double)A[i]+(double)B[i]/1000000;
		}
		
		
		for(int i=0;i<A.length;i++){
			for(int j=i+1;j<A.length;j++){
				if((C[i]*C[j]) >= (C[i]+C[j])){
					count ++;
				} 
			}
		}
		return count;
	}
}