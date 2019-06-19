package com.capgemini;
public class Program10
{
	public static void main(String[] args) {
		int ppl[] = new int[]{40,40,100,80,20};
		int flr[] = new int[]{3,3,2,2,3};
		int cnt = 0;
		
		for(int i=0;i<ppl.length-1;i++){
			int weight = ppl[i]+ ppl[i+1];
			if(weight <=200){
				i = i + 1;
				int firstFlr = flr[i];
				int secondFlr = flr[i+1];
				if(firstFlr == secondFlr){
					cnt = cnt + 2;					
				}
				else{
					cnt = cnt +3;
				}
			}
			else{
				weight = ppl[i];
				cnt = cnt + 2;
			}
		}
		System.out.println("Count : "+ cnt);
	}
}