package com.capgemini;
public class Problem16 {
    public static void main(String[] args) {
        System.out.println("\nEx1: " + solution(3453));
   }
    public static int solution(int n) {
        int[] d = new int[30];
        int len = 0, res = -1;
        
        while (n > 0) {
            d[len] = n % 2;	
            n /= 2;
            len++;
        } 
        for (int p = 1; p < len; p++) {
            if (p <= len / 2) {
                boolean ok = true;
                for (int i = 0; i < len - p; i++) {
                    if (d[i] != d[i + p]) {
                        ok = false;
                        break;
                    }
                }
                if (ok) {
                    res = p;
                }
            }
        }
         
        return res;
    }
}