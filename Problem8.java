package com.capgemini;
import java.util.Arrays;
public class Problem8 {
	public static void main(String[] args) {
		System.out.println("minimum absolute sum: ");
		System.out.println(solution1(new int[]{2, -4, 6, -3, 9}));
	}
	public static int solution1(int A[]){
		int N = A.length;
		Arrays.sort(A);
		int tail = 0;
		int head = N - 1;
		int minAbsSum = Math.abs(A[tail] + A[head]);
		while (tail <= head) {
			int currentSum = A[tail] + A[head];
			minAbsSum = Math.min(minAbsSum, Math.abs(currentSum));
			if (currentSum <= 0)
				tail++;
			else
				head--;
		}
		return minAbsSum;
	}	 
}