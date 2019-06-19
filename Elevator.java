package com.capgemini;
import java.util.LinkedHashSet;
public class Elevator {
	public static void main(String[] args) {
		System.out.println("Number of stops");
		int stops = solution(new int[]{40,40,100, 80,20}, new int[]{3,3,2,2,3}, 3, 5, 200);
		System.out.println(stops);
	}
    /*A = Weights array
      B = Target floor
      M = No of floors
      X = Max capacity
      Y = Max weight
      */
    public static int solution(int[] A, int[] B, int M, int X, int Y) {
        if(A.length != B.length) {
            return 0;
        }
        int ans = solve(A,B,M,X,Y);
        return ans;
    }

    private static int solve(int[] weights, int[] targetFloor, int totalFloors, int maxCap, int maxWeight) {
        int length = weights.length;
        int i = 0;
        int stops = 0;
        while(i < length) {
            long groupWeight = 0;
            int cap = 0;

            LinkedHashSet uniqueFloors = new LinkedHashSet();
            while(cap < maxCap && i < length && groupWeight + weights[i] <= maxWeight) {
                groupWeight = groupWeight + weights[i];
                uniqueFloors.add(targetFloor[i]);
                i++;
                cap++;
            }
            stops = stops + uniqueFloors.size() + 1;
        }
        return stops;
    }
}