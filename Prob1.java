package com.capgemini;

import java.util.Arrays;
//class
public class Prob1 {
	//starting point
	public static void main(String[] args) {
		int arr[] = {1,5,3,3,7};	 
		boolean chk = check(arr);
		System.out.println(chk);
	}
	public static boolean check( int[] A) {
		int count = 0;
		int[] B = Arrays.copyOf(A, A.length);
		Arrays.sort(B);
		for (int i = 0; i < A.length; i++) {
			if (A[i] != B[i])
				count++;
		}
		if (count > 2)
			return false;		
		return true;
	}
}